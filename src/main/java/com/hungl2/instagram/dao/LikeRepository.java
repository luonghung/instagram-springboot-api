package com.hungl2.instagram.dao;

import com.hungl2.instagram.entity.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Likes, Integer> {
}
