package com.projects.One.user;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {


    UserEntity requestToEntity(UserRequest request);

    UserResponse entityToResponse(UserEntity entity);

}
