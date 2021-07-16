package com.hungl2.instagram.serviceimpl;

import com.hungl2.instagram.dao.UserRepository;
import com.hungl2.instagram.entity.Users;
import com.hungl2.instagram.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository usersRepository;

    public UserServiceImpl(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
}
