package com.ll.gb.domain.post.post.dto

import java.time.LocalDateTime

data class PostDto(
    val id: Long,
    val createdDate: LocalDateTime,
    val modifyDate: LocalDateTime,
    val title: String,
    val content: String
)