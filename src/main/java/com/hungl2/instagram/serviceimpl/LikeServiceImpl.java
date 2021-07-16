package com.hungl2.instagram.serviceimpl;

import com.hungl2.instagram.dao.LikeRepository;
import com.hungl2.instagram.service.LikeService;
import org.springframework.stereotype.Service;

@Service
public class LikeServiceImpl implements LikeService {
    private final LikeRepository likeRepository;

    public LikeServiceImpl(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }
}
