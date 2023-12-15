package com.signup.practice.member.repository

import com.signup.practice.member.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long>{
    fun findByLoginId(loginId : String) : Member?
}