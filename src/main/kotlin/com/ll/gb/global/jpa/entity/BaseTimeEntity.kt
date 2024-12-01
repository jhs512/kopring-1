package com.ll.gb.global.jpa.entity

import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@MappedSuperclass
class BaseTimeEntity : BaseEntity() {
    @CreatedDate
    var createDate: LocalDateTime = LocalDateTime.now()

    @LastModifiedDate
    var modifyDate: LocalDateTime = LocalDateTime.now()
}
