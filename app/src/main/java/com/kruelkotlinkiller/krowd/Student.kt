package com.kruelkotlinkiller.krowd
import com.google.firebase.database.Exclude

class Student(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email : String,
    val courseId : String
   ){

    constructor():this("","","","",""){

    }

//    @Exclude
//    fun toMap(): Map<String, Any?> {
//        return mapOf(
//            "id" to id,
//            "firstName" to firstName,
//            "lastName" to lastName,
//            "password" to password
//
//        )
//    }

}