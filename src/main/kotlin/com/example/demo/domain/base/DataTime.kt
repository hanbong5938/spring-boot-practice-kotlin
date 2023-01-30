package com.example.demo.domain.base

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate
import java.io.Serializable
import java.time.LocalDateTime

@MappedSuperclass
abstract class DataTime : Serializable {
    @CreatedDate
    @Column(updatable = false)
    var createdDate: LocalDateTime? = null

    @UpdateTimestamp
    var updatedDate: LocalDateTime? = null
}
