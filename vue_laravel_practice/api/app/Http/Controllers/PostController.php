<?php

namespace App\Http\Controllers;

use App\Models\Post;
use Illuminate\Http\Request;

class PostController extends Controller
{
    public function index() {
        $posts = Post::with('user')
            ->with('likes')
            ->with('comments')
            ->orderby('created_at', 'desc')
            ->get();
        return compact('posts');
    }

    public function store(Request $request) {
        $post = new Post();
        $post->content = $request->content;
        $post->user_id = $request->user_id;
        $post->save();
    }
    
    public function destroy($id) {
        Post::find($id)->delete();
    }
}
