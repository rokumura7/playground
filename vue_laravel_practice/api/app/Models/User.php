<?php

namespace App\Models;

use Illuminate\Database\Eloquent\SoftDeletes;
use Illuminate\Notifications\Notifiable;
use Illuminate\Contracts\Auth\MustVerifyEmail;
use Illuminate\Foundation\Auth\User as Authenticatable;

class User extends Authenticatable
{
    use Notifiable;
    use SoftDeletes;
    protected $dates = ['deleted_at'];

    /**
     * The attributes that are mass assignable.
     *
     * @var array
     */
    protected $fillable = [
        'name', 'email', 'password',
    ];

    /**
     * The attributes that should be hidden for arrays.
     *
     * @var array
     */
    protected $hidden = [
        'password', 'remember_token',
    ];

    /**
     * The attributes that should be cast to native types.
     *
     * @var array
     */
    protected $casts = [
        'email_verified_at' => 'datetime',
    ];

    public function posts() {
        return $this->hasMany(Post::class, 'user_id');
    }
    
    public function comments() {
        return $this->hasMany(Comment::class, 'user_id');
    }
    
    public function likes() {
        return $this->hasMany(Like::class, 'user_id');
    }
    
    protected static function boot() {
        parent::boot();
    
        static::deleting(function($users) {
            foreach ($users->posts()->get() as $post) {
                $post->delete();
            }
            foreach ($users->comments()->get() as $comment) {
                $comment->delete();
            }
            foreach ($users->likes()->get() as $like) {
                $like->delete();
            }
        });
    }
}
