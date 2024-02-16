package com.codepresso.codepressoblog.controller.dto;

import com.codepresso.codepressoblog.vo.Post;
import lombok.Setter;

@Setter
public class PostRequestDto {
    private int id;
    private String title;
    private String content;
    private String username;

    public Post getPost(){
        return new Post(this.id, this.title, this.content, this.username);
    }
}
