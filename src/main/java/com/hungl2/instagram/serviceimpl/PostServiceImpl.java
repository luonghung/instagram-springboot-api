package com.hungl2.instagram.serviceimpl;

import com.hungl2.instagram.dao.PostRepository;
import com.hungl2.instagram.entity.Posts;
import com.hungl2.instagram.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Posts> findAllByUserId(Integer userId) {
        return postRepository.findAllByUserId(userId);
    }
}
