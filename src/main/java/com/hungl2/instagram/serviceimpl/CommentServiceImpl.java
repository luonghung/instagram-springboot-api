package com.hungl2.instagram.serviceimpl;

import com.hungl2.instagram.dao.CommentRepository;
import com.hungl2.instagram.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    
    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
}
