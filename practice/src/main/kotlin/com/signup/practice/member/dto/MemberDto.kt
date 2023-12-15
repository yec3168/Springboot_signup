package com.signup.practice.member.dto

import com.signup.practice.common.status.Gender
import java.time.LocalDate

data class MemberDto(
        val id: Long?,
        val loginId : String,
        val password: String,
        val name : String,
        val birthDate : LocalDate,
        val gender : Gender,
        val email : String,
)
