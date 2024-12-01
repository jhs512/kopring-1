package com.ll.gb.domain.post.post.entity

import com.ll.gb.global.jpa.entity.BaseTimeEntity
import jakarta.persistence.Entity

@Entity
class Post(
    var title: String,
    var content: String
) : BaseTimeEntity()