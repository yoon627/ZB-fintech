package com.zerobase.api.exception

import org.springframework.http.HttpStatus

enum class CustomErrorCode (
    val statusCode: HttpStatus,
    val errorCode: String,
    val errorMessage: String
){
    RESULT_NOT_FOUND(HttpStatus.BAD_REQUEST, "E001", errorMessage = "result not found")
}