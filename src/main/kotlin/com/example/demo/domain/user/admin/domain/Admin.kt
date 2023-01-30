package com.example.demo.domain.user.admin.domain

import com.example.demo.domain.user.common.domain.Account
import com.example.demo.domain.user.common.domain.UserType
import com.example.demo.domain.user.member.domain.Member
import jakarta.persistence.Entity
import org.hibernate.Hibernate
import org.springframework.security.core.GrantedAuthority

@Entity
data class Admin(var duty: String?) : Account() {
    constructor() : this("")

    override var userType: UserType = UserType.ADMIN

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
