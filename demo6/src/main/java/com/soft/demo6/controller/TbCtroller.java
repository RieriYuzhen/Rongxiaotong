package com.soft.demo6.controller;
import com.soft.demo6.pojo.Result;
import com.soft.demo6.pojo.TbUser;
import com.soft.demo6.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@RestController
@CrossOrigin(origins = "*")
public class TbCtroller {
    @Autowired
    private JdbcTemplate jdbc;
//登录
    @PostMapping("/doLogin")
    public Result doLogin(@RequestBody TbUser tbUser){
        System.out.println(tbUser);
        Result result = new Result();
        try {
            TbUser tbUser1 = jdbc.queryForObject("select * from tb_user where user_name=? and password=?",
                    new BeanPropertyRowMapper<>(TbUser.class), tbUser.getUserName(), tbUser.getPassword());
            result.setCode(200);//正常
            tbUser1.setToken(JwtTokenUtil.createToken());
            result.setResult(tbUser1);
            return result;
        }catch(DataAccessException e){
            e.printStackTrace();
            result.setCode(201);//错误
            result.setResult("密码或用户名错误");
            return result;
        }
    }
    @PostMapping("/check_token")
    public boolean checkToken(HttpServletRequest request){
        String token = request.getHeader("token");
        return JwtTokenUtil.checkToken(token);
    }

//注册
    @PostMapping("/doRegister")
    public Result doRegister(@RequestBody TbUser tbUser){
        Result result = new Result();
        Timestamp time= new Timestamp(System.currentTimeMillis());//获取系统当前时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStr = df.format(time);
        time = Timestamp.valueOf(timeStr);
        //创建时间和更新时间在注册时都一样
        try {
           int update = jdbc.update(
                   "insert into tb_user(user_name,password,nick_name,phone,identity_num,create_time,update_time,real_name) VALUES (?,?,?,?,?,?,?,?);",
                   tbUser.getUserName(), tbUser.getPassword(), tbUser.getNickName(), tbUser.getPhone(), tbUser.getIdentityNum(),time,time,tbUser.getRealName());
            result.setCode(200);
            result.setResult("注册成功");
            return result;
        }catch(DataAccessException e){
            e.printStackTrace();
            result.setCode(201);
            result.setResult("注册失败");
            return result;
        }
    }


   // 个人信息更改 头像还未处理
    @PostMapping("/MyInfo")
    public TbUser MyInfo(@RequestBody TbUser tbUser2){
        HttpServletRequest request =null;//set初始值 这里应该重新申请但我还没想好
        Timestamp time= new Timestamp(System.currentTimeMillis());//获取系统当前时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStr = df.format(time);
        time = Timestamp.valueOf(timeStr);//update_time
//create_time 会被更新  ！！！验证令牌-》从该用户原有create_time取用
            try {
                int update = jdbc.update(
                        "insert into tb_user(user_name,password,nick_name,phone,identity_num,create_time,update_time,real_name) VALUES (?,?,?,?,?,?,?,?);",
                        tbUser2.getUserName(), tbUser2.getPassword(), tbUser2.getNickName(), tbUser2.getPhone(), tbUser2.getIdentityNum(),time,time,tbUser2.getRealName());
                return tbUser2;
            }catch(DataAccessException e){
                e.printStackTrace();
                return null;
            }

    }
}
