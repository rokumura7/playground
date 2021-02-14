<?php

namespace App\Http\Controllers;

use App\Models\Comment;
use Illuminate\Http\Request;
use JWTAuth;

class CommentController extends Controller
{
    public function fetch() {
        $user = JWTAuth::parseToken()->authenticate();
        if ($user->is_admin) {
            $comments = Comment::all();
            return compact('comments');
        } else {
            return response()->json(['error' => 'invalid access'], 401);
        }
    }

    public function store(Request $request) {
        $user = JWTAuth::parseToken()->authenticate();
        $comment = new Comment();
        $comment->post_id = $request->post_id;
        $comment->content = $request->content;
        $comment->user_id = $user->id;
        $comment->save();
    }

    public function destroy($id) {
        Comment::find($id)->delete();
    }
}
