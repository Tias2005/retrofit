package com.example.retrofit

import com.google.gson.annotations.SerializedName

//{
//    "fullName": "Harry James Potter",
//    "nickname": "Harry",
//    "hogwartsHouse": "Gryffindor",
//    "interpretedBy": "Daniel Radcliffe",
//    "children": [
//    "James Sirius Potter",
//    "Albus Severus Potter",
//    "Lily Luna Potter"
//    ],
//    "image": "https://raw.githubusercontent.com/fedeperin/potterapi/main/public/images/characters/harry_potter.png",
//    "birthdate": "Jul 31, 1980",
//    "index": 0
//}

data class Character (val fullname:String,
    @SerializedName("fullName")
    val nickName:String,
    val hogwartsHouse:String,
    val interpretedBy:String,
    val children:List<String>,
    val image:String,
    val birthdate:String,
    val index:Int)