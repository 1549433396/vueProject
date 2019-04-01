package com.jst.demo.dao;

import com.jst.demo.model.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {
    int deleteByPrimaryKey(String uid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    Users selectUserNameAndPwd(Users users);
}