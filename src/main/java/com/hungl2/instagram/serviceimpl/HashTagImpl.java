package com.hungl2.instagram.serviceimpl;

import com.hungl2.instagram.dao.HashTagRepository;
import com.hungl2.instagram.service.HashTagService;
import org.springframework.stereotype.Service;

@Service
public class HashTagImpl implements HashTagService {
    private final HashTagRepository hashTagRepository;

    public HashTagImpl(HashTagRepository hashTagRepository) {
        this.hashTagRepository = hashTagRepository;
    }
}
