package com.zerobase.css.dto

class LoanRequestDto {
    data class RequestInputDto(
        val userKey: String,
        val userName: String,
        val userIncomeAmount: Long,
        val userRegistrationNumber: String
    )
}