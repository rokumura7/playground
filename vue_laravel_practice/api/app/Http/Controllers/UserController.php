<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use JWTAuth;
use Tymon\JWTAuth\Exceptions\JWTException;

class UserController extends Controller
{
    public function fetch() {
        $user = JWTAuth::parseToken()->authenticate();
        if ($user->is_admin) {
            $users = User::all();
            return compact('users');
        } else {
            return response()->json(['error' => 'invalid access'], 401);
        }
    }
    
    public function index() {
        if (JWTAuth::getToken() == null) {
            return response()->json(['user' => null]);
        } else {
            $user = JWTAuth::parseToken()->authenticate();
            return compact('user');
        }
    }

    public function login(Request $request) {
        return $this->auth($request);
    }
    
    public function store(Request $request) {
        $user = new User();
        $user->name = $request->name;
        $user->email = $request->email;
        $user->password = bcrypt($request->password);
        $user->save();
        return $this->auth($request);
    }
    
    private function auth(Request $request) {
        $credentials = $request->only('email', 'password');
        try {
            $token = JWTAuth::attempt($credentials);
            if (!$token) {
                return response()->json(['error' => 'invalid_credentials'], 401);
            }
        } catch (JWTException $ex) {
            return response()->json(['error' => 'could_not_create_token : ' . $ex], 500);
        }
        $user = User::where('email', $request->email)
            ->where('password', $request->password)
            ->get();
        return compact('user', 'token');
    }
    
    public function logout() {}
    
    public function destroy($id) {
        $user = User::find($id);
        $user->delete();
    }
}
