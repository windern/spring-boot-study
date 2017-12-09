package com.windern.demo.service.mapper;

import com.windern.demo.service.entity.UserEntity;

import java.util.List;

public interface UserMapper {
    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}
