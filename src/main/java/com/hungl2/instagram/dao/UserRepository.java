package com.hungl2.instagram.dao;

import com.hungl2.instagram.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
}
