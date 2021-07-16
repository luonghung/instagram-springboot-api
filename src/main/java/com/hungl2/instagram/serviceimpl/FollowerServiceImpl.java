package com.hungl2.instagram.serviceimpl;

import com.hungl2.instagram.dao.FollowerRepository;
import com.hungl2.instagram.service.FollowerService;
import org.springframework.stereotype.Service;

@Service
public class FollowerServiceImpl implements FollowerService {
    private final FollowerRepository followerRepository;

    public FollowerServiceImpl(FollowerRepository followerRepository) {
        this.followerRepository = followerRepository;
    }
}
