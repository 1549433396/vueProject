package com.jst.demo.service;

import com.jst.demo.model.Users;

/**
 * @author jiast
 * @create 2019-03-29 15:25
 */
public interface userService {

    Users selectByUserNameAndPwd(Users users);


}
