package com.hungl2.instagram.rest;

import com.hungl2.instagram.entity.Posts;
import com.hungl2.instagram.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
}
