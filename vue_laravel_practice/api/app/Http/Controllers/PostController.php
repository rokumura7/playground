<?php

namespace App\Http\Controllers;

use App\Models\Post;
use Illuminate\Http\Request;
use JWTAuth;

class PostController extends Controller
{
    public function fetch() {
        $user = JWTAuth::parseToken()->authenticate();
        if ($user->is_admin) {
            $posts = Post::with('user')
                ->with('likes')
                ->with('comments')
                ->get();
            return compact('posts');
        } else {
            return response()->json(['error' => 'invalid access'], 401);
        }
    }
    public function index() {
        $posts = Post::with('user')
            ->with('likes')
            ->with('comments')
            ->orderby('created_at', 'desc')
            ->get();
        return compact('posts');
    }

    public function store(Request $request) {
        $user = JWTAuth::parseToken()->authenticate();
        $post = new Post();
        $post->content = $request->content;
        $post->user_id = $user->id;
        $post->save();
    }
    
    public function destroy($id) {
        Post::find($id)->delete();
    }
}
