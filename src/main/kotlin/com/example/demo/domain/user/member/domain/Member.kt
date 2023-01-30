package com.example.demo.domain.user.member.domain

import com.example.demo.domain.user.common.domain.Account
import com.example.demo.domain.user.common.domain.UserType
import jakarta.persistence.Entity
import org.hibernate.Hibernate
import org.springframework.security.core.GrantedAuthority

@Entity
data class Member(var etc: String?) : Account() {
    constructor() : this(null)

    override var userType: UserType = UserType.MEMBER

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return mutableListOf()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Member

        return id == other.id
    }
    override fun hashCode(): Int = javaClass.hashCode()

    override fun toString() = ""

}
