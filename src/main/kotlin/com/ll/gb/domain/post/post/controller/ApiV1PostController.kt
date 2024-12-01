package com.ll.gb.domain.post.post.controller

import com.ll.gb.domain.post.post.dto.PostDto
import com.ll.gb.domain.post.post.service.PostService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/posts")
class ApiV1PostController(
    private val postService: PostService
) {
    @GetMapping("")
    fun findAll(): List<PostDto> =
        postService.findAll().map { PostDto(it.id, it.createDate, it.modifyDate, it.title, it.content) }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): PostDto {
        val post = postService.findById(id).get()
        return PostDto(post.id, post.createDate, post.modifyDate, post.title, post.content)
    }

    @GetMapping("/write")
    fun write(title: String, content: String): PostDto {
        val post = postService.write(title, content)

        return PostDto(post.id, post.createDate, post.modifyDate, post.title, post.content)
    }
}