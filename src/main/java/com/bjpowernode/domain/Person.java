package com.bjpowernode.domain;

/**
 * ClassName:Person
 * Package:com.bjpowernode.domain
 * Description
 *
 * @date:2019/11/21 21:34
 * @author:lsz
 */
public class Person {
    private int id;
    private int age;
    private String address;

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
