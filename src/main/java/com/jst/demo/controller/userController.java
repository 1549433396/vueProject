package com.jst.demo.controller;

import com.jst.demo.model.User;
import com.jst.demo.model.Users;
import com.jst.demo.service.userService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author jiast
 * @create 2019-03-20 15:51
 */
@RestController
@RequestMapping("/users")
public class userController {

    @Autowired
    private userService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value="测试登录接口", notes="我只是想知道你在哪里显示")
//    @ApiImplicitParams({@ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "string")})
    public String getAllUsers(@RequestBody User user2){
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId("1");
        user.setCreateTime(new Date());
        user.setUserAddr("上海");
        user.setUserName("贾仕涛");
        User user1 = new User();
        user1.setId("2");
        user1.setCreateTime(new Date());
        user1.setUserAddr("湖北襄阳");
        user1.setUserName("jst1");
        users.add(user);
        users.add(user1);
        return "success";
    }


    @RequestMapping(value = "/checkUser",method = RequestMethod.POST)
    @ApiOperation(value="测试登录接口", notes="我只是想知道你在哪里显示")
//    @ApiImplicitParams({@ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "string")})
    public Users getcheckUser(Users user2){
        return userService.selectByUserNameAndPwd(user2);
    }



}
