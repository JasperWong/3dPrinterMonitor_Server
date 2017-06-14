package com.jasper.ssm.service;

import com.jasper.ssm.pojo.User;

/**
 * Created by JasperWong on 16/1/19.
 */
public interface UserService {
    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    void delete(Integer id);
    void insertUser(User user);
    void updateUser(User user);
    User SelectById(Integer id);
    void updateTemp(User user);
    Boolean saveUser(User user) throws  Exception;
}
