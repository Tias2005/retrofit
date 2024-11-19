package com.example.retrofit

//Example Value
//Schema
//{
//      "feedbackType": "General",
//      "feedback": "string",
//      "entityId":

data class Feedback (val feedbackType:String,
    val feedback: String,
    val entityId:String)