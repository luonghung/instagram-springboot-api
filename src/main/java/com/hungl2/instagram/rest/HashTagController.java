package com.hungl2.instagram.rest;

import com.hungl2.instagram.service.HashTagService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/hashtags")
public class HashTagController {
    private HashTagService hashTagService;

    public HashTagController(HashTagService hashTagService) {
        this.hashTagService = hashTagService;
    }
}
