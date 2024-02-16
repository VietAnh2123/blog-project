package com.codepresso.codepressoblog.mapper;

import com.codepresso.codepressoblog.vo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostMapper {

    public List<Post> getAllPost();

    public  List<Post> getByPage(@Param("limit") Integer limit,@Param("offset") Integer offset);

    public Post findDetail(@Param("id") Integer id);

    Integer save(@Param("post") Post post);

    Integer edit(@Param("post") Post post);

}
