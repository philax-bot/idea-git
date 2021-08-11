package com.bjpowernode.pojo;

import java.io.Serializable;

/**
 * @author Liu
 * @create 2021-08-11 10:48
 */
public class User implements Serializable {
    private static final long serialVersionUID = -953354225856066300L;
    
    private String userid;
    private String name;
    private Integer age;
    private String address;
    private String bb;
    
    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
    public String getUserid() {
        return userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
}
