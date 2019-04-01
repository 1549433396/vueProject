package com.jst.demo.service.impl;

import com.jst.demo.dao.UsersMapper;
import com.jst.demo.model.Users;
import com.jst.demo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jiast
 * @create 2019-03-29 15:26
 */
@Service
@Transactional
public class userServiceImpl implements userService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users selectByUserNameAndPwd(Users users) {
        return usersMapper.selectUserNameAndPwd(users);
    }
}
