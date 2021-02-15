<?php

namespace App\Models;

use Tymon\JWTAuth\Contracts\JWTSubject;
use Illuminate\Database\Eloquent\SoftDeletes;
use Illuminate\Foundation\Auth\User as Authenticatable;

class User extends Authenticatable implements JWTSubject
{
    use SoftDeletes;
    protected $dates = ['deleted_at'];

    protected $fillable = [
        'name', 'email', 'password',
    ];

    protected $hidden = [
        'password', 'remember_token',
    ];

    public function getJWTIdentifier() {
        return $this->getKey();
    }
    
    public function getJWTCustomClaims() {
        return [];
    }

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
