package com.jasper.ssm.pojo;

import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private Integer switch1;
    private Integer switch2;
    private Integer camera;

    public Integer getSwitch1() {
        return switch1;
    }

    public void setSwitch1(Integer switch1) {
        this.switch1 = switch1;
    }

    public Integer getSwitch2() {
        return switch2;
    }

    public void setSwitch2(Integer switch2) {
        this.switch2 = switch2;
    }

    public Integer getCamera() {
        return camera;
    }

    public void setCamera(Integer camera) {
        this.camera = camera;
    }

    public Integer getId() {
        return id;

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

 }