package com.jasper.ssm.service;

import com.jasper.ssm.pojo.User;
import com.jasper.ssm.pojo.UserExample;

import java.util.List;

/**
 * Created by JasperWong on 16/1/19.
 */
public interface UserService {
    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<User> findUser()throws Exception;
    void delete(Integer id);
    void insertUser(User user);
    void updateUser(User user);
    Boolean saveUser(User user) throws  Exception;
}
