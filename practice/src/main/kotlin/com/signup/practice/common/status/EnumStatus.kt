package com.signup.practice.common.status

enum class Gender(val desc: String) {
    MAN(desc = "남"),
    WOMAN(desc= "여")
}

enum class ResultCode(val msg :String){
    SUCCESS("정상처리 되었습니다."),
    FAILED("실패하였습니다."),
    ERROR("에러가 발생하였습니다.")
}