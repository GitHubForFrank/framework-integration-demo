package com.zmz.mybatis.infrastructure.dao.mapper;

import com.zmz.mybatis.infrastructure.dao.entity.UserEntity;

import java.util.List;

/**
 * 自己封装了一个RepositoryHelperImpl，需要保证以下两点
 * 1. Mapper接口是Entity类名字拼接Mapper作为Mapper接口而成
 * 2. Mapper接口放到和entity同级的mapper文件夹
 * @author ASNPHDG
 * @create 2020-01-03 22:55
 */
public interface UserMapper {

    void insert(UserEntity user);
    void deleteById(Long id);
    void updateByPrimaryKeySelective(UserEntity user);
    UserEntity selectByPrimaryKey(Long id);
    List<UserEntity> queryAllUser();

}
