package com.bjpowernode.domain;

/**
 * ClassName:User
 * Package:com.bjpowernode.domain
 * Description
 *
 * @date:2019/11/19 20:15
 * @author:lsz
 */
public class User {
    private int id;
    private String name;
    private String address;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
