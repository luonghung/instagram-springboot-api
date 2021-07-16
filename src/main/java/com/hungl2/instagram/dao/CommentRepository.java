package com.hungl2.instagram.dao;

import com.hungl2.instagram.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comments, Integer> {
}
