package com.example.retrofit

//{
//    "number": 1,
//    "title": "Harry Potter and the Sorcerer's Stone",
//    "originalTitle": "Harry Potter and the Sorcerer's Stone",
//    "releaseDate": "Jun 26, 1997",
//    "description": "On his birthday, Harry Potter discovers that he is the son of two well-known wizards, from whom he has inherited magical powers. He must attend a famous school of magic and sorcery, where he establishes a friendship with two young men who will become his companions on his adventure. During his first year at Hogwarts, he discovers that a malevolent and powerful wizard named Voldemort is in search of a philosopher's stone that prolongs the life of its owner.",
//    "pages": 223,
//    "cover": "https://raw.githubusercontent.com/fedeperin/potterapi/main/public/images/covers/1.png",
//    "index": 0
//},

data class Book (val nummber:Int,
val title:String,
val originalTitle:String,
val releaseDate:String,
val description:String,
val pages:Int,
val cover:String,
val index:Int
)