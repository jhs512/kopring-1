package com.ll.gb.global.jpa.entity

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.IDENTITY
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import org.springframework.data.domain.Persistable

@MappedSuperclass
class BaseEntity : Persistable<Long> {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    var id: Long = 0

    override fun getId(): Long = id

    override fun isNew(): Boolean = id == 0L
}
