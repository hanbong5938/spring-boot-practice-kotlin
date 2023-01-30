package com.example.demo.domain.user.common.domain

import jakarta.persistence.Embeddable
import java.time.LocalDateTime

@Embeddable
class Password private constructor(var value: String) {
    constructor() : this("") {}

    private var lastUpdateDate: LocalDateTime = LocalDateTime.now()

    fun checkExpired(): Boolean {
        return lastUpdateDate.isBefore(LocalDateTime.now().minusDays(90))
    }

    fun update(value: String) {
        this.value = value
        this.lastUpdateDate = LocalDateTime.now()
    }


    data class Builder(var value: String = "") {
        fun value(value: String) = apply { this.value = value }
        fun build() = Password(value)
    }

    companion object {
        fun of(value: String) = Builder().value(value).build()
    }
}
