package com.jasper.ssm.mapper;

import com.jasper.ssm.pojo.User;

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int update(User record);

    int insertSelective(User record);

    int updateTemp(User user);

    User selectByPrimaryKey(Integer id);




}