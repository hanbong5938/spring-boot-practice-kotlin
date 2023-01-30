package com.example.demo.domain.user.common.domain

import jakarta.persistence.Embeddable

@Embeddable
class Email private constructor(var value: String) {

    constructor() : this("") {}

    data class Builder(var value: String = "") {
        private fun value(value: String) = apply { this.value = value }
        fun build() = Email(value)
    }

    companion object {
        fun of(value: String) = Builder(value).build()
    }

}
