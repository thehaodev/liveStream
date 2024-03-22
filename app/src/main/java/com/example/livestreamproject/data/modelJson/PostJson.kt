package com.example.livestreamproject.data.modelJson

import com.example.livestreamproject.data.models.Post

class PostJson(
    private val userId: Int?,
    private val id: Int?,
    private val title: String?,
    private val body: String
) {

    fun toPost(): Post{
        return Post(
            userId = userId,
            id = id,
            title = title,
            body = body
        )
    }

}