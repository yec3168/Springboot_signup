package com.signup.practice.member.service

import com.signup.practice.common.exception.InvalidInputException
import com.signup.practice.member.dto.MemberDto
import com.signup.practice.member.entity.Member
import com.signup.practice.member.repository.MemberRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Transactional
@Service
class MemberService (
    private val memberRepository : MemberRepository
){
    fun signUp(memberDto: MemberDto):String{
        var member : Member? = memberRepository.findByLoginId(memberDto.loginId)
        if (member != null){
           throw InvalidInputException("loginId", "이미 등록된 ID 입니다.")
        }

        member = memberDto.toEntity()

        memberRepository.save(member)
        return "회원가입이 완료되었습니다."
    }
}