package com.czd.springSecurity.com.czd.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

/**
 * 系统角色类
 *
 * @author: czd
 * @create: 2018/4/2 16:45
 */
@Entity
public class SysRole {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
