package com.soft.demo6.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft.demo6.mapper.TbOrderMapper;
import com.soft.demo6.pojo.TbOrder;
import com.soft.demo6.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<TbOrderMapper,TbOrder>implements OrderService {
}
