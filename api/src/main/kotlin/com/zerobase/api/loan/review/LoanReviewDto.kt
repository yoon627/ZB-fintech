package com.zerobase.api.loan.review

import com.zerobase.api.loan.request.LoanRequestServiceImpl

class LoanReviewDto {
    data class LoanReviewResponseDto(
        val userKey: String,
        val loanResult: LoanResult
    )

    data class LoanResult(
        val userLimitAmount: Long,
        val userLoanInterest: Double
    )

    data class LoanReview(
        val userKey: String,
        val userLimitAmount: Long,
        val userLoanInterest: Double
    )
}