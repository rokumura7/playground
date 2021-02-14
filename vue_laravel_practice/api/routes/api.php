<?php

Route::middleware('api')->prefix('v1')->group(function() {
    Route::post('signUp', 'UserController@store');
    Route::post('login',  'UserController@login');
    Route::get('logout',  'UserController@logout')->middleware('jwt.refresh');
    Route::get('users',   'UserController@index');
    
    Route::middleware('jwt.auth')->group(function() {
        Route::resource('users',     'UserController', 
            array('except' => array('index', 'create', 'show', 'edit', 'update')));
        Route::resource('posts',     'PostController', 
            array('except' => array('show', 'create', 'edit', 'update')));
        Route::resource('comments',  'CommentController', 
            array('except' => array('show', 'create', 'edit', 'update')));
        Route::post('like',          'LikeController@like');
        Route::post('unlike',        'LikeController@unlike');
        Route::delete('likes/{id}',  'LikeController@destroy');
        // 管理者向けAPI
        Route::get('fetch_users',    'UserController@fetch');
        Route::get('fetch_posts',    'PostController@fetch');
        Route::get('fetch_likes',    'LikeController@fetch');
        Route::get('fetch_comments', 'CommentController@fetch');
    });
});