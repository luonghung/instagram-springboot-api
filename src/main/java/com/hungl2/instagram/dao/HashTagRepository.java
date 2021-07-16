package com.hungl2.instagram.dao;

import com.hungl2.instagram.entity.HashTags;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HashTagRepository extends JpaRepository<HashTags, Integer> {
}
