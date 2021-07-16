package com.hungl2.instagram.dao;

import com.hungl2.instagram.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Posts, Integer> {
}
