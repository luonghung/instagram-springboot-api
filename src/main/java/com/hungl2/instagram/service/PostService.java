package com.hungl2.instagram.service;

import com.hungl2.instagram.entity.Posts;

import java.util.List;

public interface PostService {
    List<Posts> findAllByUserId(Integer userId);
}
