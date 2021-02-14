<?php

namespace App\Models;

use Illuminate\Database\Eloquent\SoftDeletes;
use Illuminate\Database\Eloquent\Model;

class Like extends Model
{
    use SoftDeletes;
    protected $dates = ['deleted_at'];
}
