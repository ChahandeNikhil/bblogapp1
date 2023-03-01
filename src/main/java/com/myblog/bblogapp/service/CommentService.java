package com.myblog.bblogapp.service;

import com.myblog.bblogapp.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId,CommentDto commentDto);
    List<CommentDto> getCommentByPostId(long postId);

    CommentDto updateComment(long postId, long id, CommentDto commentDto);

     void deleteComment(long postId, long commentId);
}
