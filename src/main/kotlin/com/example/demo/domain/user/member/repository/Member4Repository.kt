package com.example.demo.domain.user.member.repository

import com.example.demo.domain.user.member.domain.Member
import com.example.demo.global.support.Querydsl4RepositorySupport
import org.springframework.stereotype.Repository

@Repository
class Member4Repository: Querydsl4RepositorySupport(Member::class.java) {
//
//        val member = QMember.member
//
//        fun findByName(name: String): Member? {
//            return this.selectFrom(member)
//                .where(member.name.eq(name))
//                .fetchOne()
//        }
}
