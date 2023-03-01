package com.myblog.bblogapp.repository;

import com.myblog.bblogapp.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long>{
        List<Comment> findByPostId(long postId);



        }
