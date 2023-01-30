package com.example.demo.domain.user.common.domain

import com.example.demo.domain.base.BaseEntity
import jakarta.persistence.Embedded
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.MappedSuperclass
import org.springframework.security.core.userdetails.UserDetails

@MappedSuperclass
abstract class Account constructor(
    var name: String = "", @Embedded var password: Password = Password.of(""),
    @Embedded var email: Email = Email.of("")
) : BaseEntity(), UserDetails {

    abstract var userType: UserType

    @Enumerated(EnumType.STRING)
    var status: AccountStatus = AccountStatus.INACTIVE

    override fun getPassword(): String {
        return this.password.value;
    }

    override fun getUsername(): String {
        return this.name;
    }

    override fun isAccountNonExpired(): Boolean {
        return !status.isExpired();
    }

    override fun isAccountNonLocked(): Boolean {
        return !status.isLocked();
    }

    override fun isCredentialsNonExpired(): Boolean {
        return password.checkExpired();
    }

    override fun isEnabled(): Boolean {
        return isAccountNonExpired && isAccountNonLocked && isCredentialsNonExpired;
    }

}
