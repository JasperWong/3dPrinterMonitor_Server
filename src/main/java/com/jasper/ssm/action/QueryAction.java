package com.jasper.ssm.action;

import com.jasper.ssm.pojo.User;
import com.jasper.ssm.service.UserService;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by jasper on 16/8/13.
 */
//将这个UserAction 注解为Controller
@Controller
public class QueryAction {

    //自动注解UserService
    @Autowired
    private UserService userService;

    private String title;
    private User SelectedUser;
    private List<User> users;
    private Integer id;
    private String username;
    private Integer switch1;
    private Integer switch2;
    private Integer camera;

    private Integer SelectId;
    private Integer SelectSwitch1;
    private Integer SelectSwitch2;
    private Integer SelectCamera;
    private Float SelectTemperature;
    private Float SelectHumidity;
    private String SelectUsername;


    //action 默认执行的入口
    public String execute(){
        if(SelectId!=0){
            SelectedUser=userService.SelectById(SelectId);
            SelectId=SelectedUser.getId();
            SelectUsername=SelectedUser.getUsername();
            SelectSwitch1=SelectedUser.getSwitch1();
            SelectSwitch2=SelectedUser.getSwitch2();
            SelectCamera=SelectedUser.getCamera();
            SelectHumidity=SelectedUser.getHumidity();
            SelectTemperature=SelectedUser.getTemperature();
        }
        return "success";
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

/***
     * 以下是 getter setter 在jsp里要调用我们的 title 和 users 就必须写setter getter方法,不然
     * 没法取到或设置其值.
     * ****/
    /**
     *
     * @return
     */
    public String getSelectUsername() {
        return SelectUsername;
    }

    public void setSelectUsername(String selectUsername) {
        SelectUsername = selectUsername;
    }

    public Integer getSelectId() {
        return SelectId;
    }

    public void setSelectId(Integer selectId) {
        SelectId = selectId;
    }
    public Integer getSelectSwitch1() {
        return SelectSwitch1;
    }

    public void setSelectSwitch1(Integer selectSwitch1) {
        SelectSwitch1 = selectSwitch1;
    }

    public Integer getSelectSwitch2() {
        return SelectSwitch2;
    }

    public void setSelectSwitch2(Integer selectSwitch2) {
        SelectSwitch2 = selectSwitch2;
    }

    public Integer getSelectCamera() {
        return SelectCamera;
    }

    public void setSelectCamera(Integer selectCamera) {
        SelectCamera = selectCamera;
    }

    public Float getSelectTemperature() {
        return SelectTemperature;
    }

    public void setSelectTemperature(Float selectTemperature) {
        SelectTemperature = selectTemperature;
    }

    public Float getSelectHumidity() {
        return SelectHumidity;
    }

    public void setSelectHumidity(Float selectHumidity) {
        SelectHumidity = selectHumidity;
    }
}
