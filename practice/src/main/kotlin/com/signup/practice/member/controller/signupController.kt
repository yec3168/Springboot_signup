package com.signup.practice.member.controller

import com.signup.practice.member.dto.MemberDto
import com.signup.practice.member.service.MemberService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/member")
@RestController
class signupController (
        private val memberService: MemberService
){
    @PostMapping("/signup")
    fun signUp(@RequestBody memberDto: MemberDto):String{
        return memberService.signUp(memberDto)
    }
}