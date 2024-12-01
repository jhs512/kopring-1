package com.ll.gb.domain.post.post.repository

import com.ll.gb.domain.post.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long> {
}