package com.codepresso.codepressoblog.service;

import com.codepresso.codepressoblog.mapper.PostMapper;
import com.codepresso.codepressoblog.vo.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private PostMapper postMapper;

    public PostService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public List<Post> getAllPost(){
        return postMapper.getAllPost();
    }

    public List<Post> getPostByPage(Integer page, Integer size){
        return postMapper.getByPage(size, (page-1) * size);
    }

    public Post getPostById(Integer id){
        return postMapper.findDetail(id);
    }

    public boolean savePost(Post post){
        Integer result = postMapper.save(post);
        return result == 1;
    }

    public boolean editPost(Post post){
        Integer result = postMapper.edit(post);
        return result == 1;
    }
}
