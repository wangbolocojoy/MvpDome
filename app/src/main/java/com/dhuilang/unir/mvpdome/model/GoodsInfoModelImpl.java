package com.dhuilang.unir.mvpdome.model;

import com.dhuilang.unir.mvpdome.contract.GoodsInfoContract;

/**
 * Created by Administrator on 2017/05/18
 */

public class GoodsInfoModelImpl implements GoodsInfoContract.Model {
    private String username;
    private String password;
    private int age;
    private String School;
    private String idcrad;

    public GoodsInfoModelImpl(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public GoodsInfoModelImpl(String username, String password, int age, String school, String idcrad) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.School = school;
        this.idcrad = idcrad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getIdcrad() {
        return idcrad;
    }

    public void setIdcrad(String idcrad) {
        this.idcrad = idcrad;
    }
}