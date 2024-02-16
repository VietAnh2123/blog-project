package com.codepresso.codepressoblog.controller.dto;

import com.codepresso.codepressoblog.vo.Post;
import lombok.Getter;

@Getter
public class PostResponseDto {
    private int id;
    private String title;
    private String content;
    private String username;

    public PostResponseDto(Post post){
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.username = post.getUsername();
    }
}
