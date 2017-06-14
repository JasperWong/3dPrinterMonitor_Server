package com.jasper.ssm.service;

import com.jasper.ssm.mapper.UserMapper;
import com.jasper.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    //User接口
    @Autowired
    private UserMapper userMapper;

    public void delete(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    public void insertUser(User user) {
        userMapper.insert(user);
    }

    public void updateUser(User user) {
        userMapper.update(user);
    }

    public Boolean saveUser(User user) throws Exception {
        return userMapper.insertSelective(user)==1;
    }

    public User SelectById(Integer id){
        User user=userMapper.selectByPrimaryKey(id);
        return user;
    }

    public void updateTemp(User user) {
        userMapper.updateTemp(user);
    }
}
