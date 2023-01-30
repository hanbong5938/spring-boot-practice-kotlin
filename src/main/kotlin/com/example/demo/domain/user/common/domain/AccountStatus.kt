package com.example.demo.domain.user.common.domain

enum class AccountStatus {
    ACTIVE,
    INACTIVE,
    DELETED;

    fun isActive() = this == ACTIVE
    fun isExpired() = !isActive()
    fun isLocked() = !isActive()
}
