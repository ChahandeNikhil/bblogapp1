package com.myblog.bblogapp.repository;

import com.myblog.bblogapp.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

