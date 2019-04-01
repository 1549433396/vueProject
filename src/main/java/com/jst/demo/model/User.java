package com.jst.demo.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jiast
 * @create 2019-03-20 16:19
 */
public class User implements Serializable {
    //主键id
    private String id;

    //用户名
    private String userName;

    //用户性别
    private String userAddr;

    //创建时间
    private Date createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
