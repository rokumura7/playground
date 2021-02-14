<?php

namespace App\Models;

use Illuminate\Database\Eloquent\SoftDeletes;
use Illuminate\Database\Eloquent\Model;

class Post extends Model
{
    use SoftDeletes;
    protected $dates = ['deleted_at'];
    
    public function user() {
        return $this->belongsTo(User::class);
    }

    public function likes() {
        return $this->hasMany(Like::class, 'post_id');
    }

    public function comments() {
        return $this->hasMany(Comment::class, 'post_id');
    }

    protected static function boot() {
        parent::boot();
    
        static::deleting(function($posts) {
            foreach ($posts->comments()->get() as $comment) {
                $comment->delete();
            }
            foreach ($posts->likes()->get() as $like) {
                $like->delete();
            }
        });
    }
}
