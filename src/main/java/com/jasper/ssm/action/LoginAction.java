package com.jasper.ssm.action;

import com.jasper.ssm.pojo.User;
import com.jasper.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Date;
import java.util.concurrent.ExecutionException;

/**
 * Created by JasperWong on 2016/8/18.
 */
@Controller
@Scope(value="prototype")
public class LoginAction {
    @Autowired
    private UserService userService;
    private User user=new User();
    private Integer id;
    private String username;
    private Integer switch1;
    private Integer switch2;
    private Integer camera;
//    private Integer form;   //form:0->get,1->set

    private Integer dbSwitch1;
    private Integer dbSwitch2;
    private Integer dbCamera;

    public String execute(){
        user.setId(id);
        user.setUsername(username);
        user.setCamera(camera);
        user.setSwitch1(switch1);
        user.setSwitch2(switch2);
        userService.updateUser(user);
        return "success";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSwitch1() {
        return switch1;
    }

    public void setSwitch1(Integer switch1) {
        this.switch1 = switch1;
    }

    public Integer getCamera() {
        return camera;
    }

    public void setCamera(Integer camera) {
        this.camera = camera;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getSwitch2() {
        return switch2;
    }

    public void setSwitch2(Integer switch2) {
        this.switch2 = switch2;
    }
}
