package com.soft.demo6.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.soft.demo6.pojo.TbUser;
import com.soft.demo6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //用户信息展示(管理员用 因为全部都会显示）

    @PostMapping("/userlist")
    public List<TbUser> list(){
        return userService.list();
    }

    // 个人信息更改 头像还未处理
    @PostMapping("/myinfomod")
    public boolean myinfomodify(@RequestBody TbUser tbUser2){
       return  userService.updateById(tbUser2);
        }

    //删除用户信息（管理员用）
    @GetMapping("/delete")
    public boolean delete(String userName){
                  return userService.removeById(userName);
    }

    //能模糊查询 匹配查询 应该也算是管理员功能
    @PostMapping("/Query")

    public List<TbUser> listQ(@RequestBody TbUser tbUser){
        LambdaQueryWrapper<TbUser> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(TbUser::getUserName,tbUser.getUserName());
        return  userService.list(lambdaQueryWrapper);
    }

    }
