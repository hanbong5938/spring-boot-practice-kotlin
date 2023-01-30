package com.example.demo.domain.base

import jakarta.persistence.*
import java.util.*


@MappedSuperclass
abstract class BaseEntity : DataTime() {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 16, updatable = false, nullable = false)
    val id: UUID = UUID.randomUUID()

    @Column(name = "deleted", nullable = false)
    private var deleted = false

    open fun deleted() {
        deleted = true
    }
}
