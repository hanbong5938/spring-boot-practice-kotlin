package com.example.demo.domain.user.member.build

import com.example.demo.domain.user.common.domain.Email
import com.example.demo.domain.user.common.domain.Password
import com.example.demo.domain.user.member.domain.Member

class MemberBuilder {

    private val member = Member()

    var name: String
        get() {
            return member.name
        }
        set(value) {
            member.name = value
        }

    var email: Email
        get() {
            return member.email
        }
        set(value) {
            member.email = value
        }

    var password: Password
        get() {
            return member.password
        }
        set(value) {
            member.password = value
        }

    var etc: String?
        get() {
            return member.etc
        }
        set(value) {
            member.etc = value
        }

    fun build(): Member {
        return member
    }

}

