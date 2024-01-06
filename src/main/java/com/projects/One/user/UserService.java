package com.projects.One.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Slf4j
@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    public UsernameExistsResponse usernameExists(String username) {
        return new UsernameExistsResponse(!ObjectUtils.isEmpty(userRepository.findByUsername(username)));
    }

    public List<UserResponse> getAllUsers() {
        return userRepository.findAll().stream().map(userMapper::entityToResponse).toList();
    }

    public UserResponse getUserByUsername(String username) {
        return userMapper.entityToResponse(userRepository.findByUsername(username));
    }

    public UserResponse addUser(UserRequest userRequest) {
        return userMapper.entityToResponse(userRepository.save(userMapper.requestToEntity(userRequest)));
    }

}
