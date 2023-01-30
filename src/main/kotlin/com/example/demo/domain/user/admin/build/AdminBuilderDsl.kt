package com.example.demo.domain.user.admin.build

import com.example.demo.domain.user.admin.domain.Admin

fun admin(adminBuilder: AdminBuilder.() -> Unit): Admin = AdminBuilder().apply(adminBuilder).build()
