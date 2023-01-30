package com.example.demo.domain.user.member.domain

import com.example.demo.domain.user.common.domain.Email
import com.example.demo.domain.user.common.domain.Password
import com.example.demo.domain.user.common.domain.UserType
import com.example.demo.domain.user.member.build.member
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MemberTest {


    @Test
    fun `Member 생성 테스트`() {
        val member: Member = member {
            name = "hello"
            email = Email.of("test")
            password = Password.of("1234")
            etc = "1234"
        }
        Assertions.assertEquals("hello", member.name)
        Assertions.assertEquals("test", member.email.value)
        Assertions.assertEquals("1234", member.password.value)
        Assertions.assertEquals("1234", member.etc)
        Assertions.assertEquals(UserType.MEMBER, member.userType)
    }
}
