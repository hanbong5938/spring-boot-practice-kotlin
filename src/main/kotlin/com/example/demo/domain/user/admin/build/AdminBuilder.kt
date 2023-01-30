package com.example.demo.domain.user.admin.build

import com.example.demo.domain.user.admin.domain.Admin
import com.example.demo.domain.user.common.domain.Email
import com.example.demo.domain.user.common.domain.Password

class AdminBuilder {
    private val admin = Admin()

    var name: String
        get() {
            return admin.name
        }
        set(value) {
            admin.name = value
        }

    var email: Email
        get() {
            return admin.email
        }
        set(value) {
            admin.email = value
        }

    var password: Password
        get() {
            return admin.password
        }
        set(value) {
            admin.password = value
        }

    var duty: String?
        get() {
            return admin.duty
        }
        set(value) {
            admin.duty = value
        }

    fun build(): Admin {
        return admin
    }
}
