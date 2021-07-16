package com.hungl2.instagram.dao;

import com.hungl2.instagram.entity.Followers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowerRepository extends JpaRepository<Followers, Integer> {
}
