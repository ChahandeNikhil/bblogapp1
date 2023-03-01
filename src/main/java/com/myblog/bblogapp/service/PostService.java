package com.myblog.bblogapp.service;

import com.myblog.bblogapp.payload.PostDto;
import com.myblog.bblogapp.payload.PostResponse;

public interface PostService {
   PostDto createPost(PostDto postDto) ;

   PostResponse getAllPosts(int pageNo, int pageSize,String sortBy,String sortDir);

   PostDto getPostById(long id);

   PostDto updatePost(PostDto postDto, long id);

   void deletePost(long id);

}
