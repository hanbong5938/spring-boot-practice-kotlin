package com.example.demo.domain.user.member.build

import com.example.demo.domain.user.member.domain.Member

fun member(memberBuilder: MemberBuilder.() -> Unit): Member = MemberBuilder().apply(memberBuilder).build()
