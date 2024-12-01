package com.ll.gb.domain.post.post.service

import com.ll.gb.domain.post.post.entity.Post
import com.ll.gb.domain.post.post.repository.PostRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PostService(
    private val postRepository: PostRepository
) {
    fun findById(id: Long) = postRepository.findById(id)

    fun findAll() = postRepository.findAll()

    @Transactional
    fun write(title: String, content: String) = postRepository.save(Post(title = title, content = content))

    @Transactional
    fun modify(post: Post, title: String, content: String) =
        post.apply {
            this.title = title
            this.content = content
        }

    @Transactional
    fun deleteById(id: Long) = postRepository.deleteById(id)
}