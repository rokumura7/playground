<?php

namespace App\Http\Controllers;

use App\Models\Like;
use Illuminate\Http\Request;

class LikeController extends Controller
{
    public function like(Request $request) {
        $like = new Like();
        $like->user_id = $request->user_id;
        $like->post_id = $request->post_id;
        $like->save();
    }
    
    public function unlike(Request $request) {
        $target = Like::where('user_id', $request->user_id)
            ->where('post_id', $request->post_id)
            ->first();
        $target->delete();
    }
    
    public function destroy($id) {
        Like::find($id)->delete();
    }
}
