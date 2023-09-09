package com.soft.demo6.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft.demo6.mapper.TbUserMapper;
import com.soft.demo6.pojo.TbUser;
import com.soft.demo6.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<TbUserMapper,TbUser>implements UserService {

}
