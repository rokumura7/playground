<?php

namespace App\Http\Controllers;

use App\Models\Like;
use Illuminate\Http\Request;
use JWTAuth;

class LikeController extends Controller
{
    public function fetch() {
        $user = JWTAuth::parseToken()->authenticate();
        if ($user->is_admin) {
            $likes = Like::all();
            return compact('likes');
        } else {
            return response()->json(['error' => 'invalid access'], 401);
        }
    }
    public function like(Request $request) {
        $user = JWTAuth::parseToken()->authenticate();
        $like = new Like();
        $like->user_id = $user->id;
        $like->post_id = $request->post_id;
        $like->save();
    }
    
    public function unlike(Request $request) {
        $user = JWTAuth::parseToken()->authenticate();
        $target = Like::where('user_id', $user->id)
            ->where('post_id', $request->post_id)
            ->first();
        $target->delete();
    }
    
    public function destroy($id) {
        Like::find($id)->delete();
    }
}
