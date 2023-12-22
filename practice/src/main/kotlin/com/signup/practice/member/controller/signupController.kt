package com.signup.practice.member.controller

import com.signup.practice.common.dto.BaseResponse
import com.signup.practice.member.dto.MemberDto
import com.signup.practice.member.service.MemberService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.GetMapping
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
    fun signUp(@RequestBody @Valid memberDto: MemberDto):BaseResponse<Unit>{
        val resultMsg:String = memberService.signUp(memberDto)
        return BaseResponse(message = resultMsg)
    }
    @GetMapping("/")
    fun hello():String{
        return "index"
    }
}
