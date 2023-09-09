//package com.soft.demo6.controller;
//
//import com.soft.demo6.pojo.TbShoppingcart;
//import com.soft.demo6.pojo.TbUser;
//import com.soft.demo6.service.ShoppingCartService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.sql.Timestamp;
//import java.text.SimpleDateFormat;
//
//@RestController
//@RequestMapping("/shoppingcart")
//public class CartController {
//    @Autowired
//    private ShoppingCartService shoppingCartService;
//
//    //update时间目前设定和create一样 还没想到办法
//    //无则创建购物车，有则选择更改内容 主要靠shoppingId判断
//    @PostMapping("/mycart")
//    public boolean myinfomodify(@RequestBody TbShoppingcart tbShoppingcart){
////        Timestamp time= new Timestamp(System.currentTimeMillis());//获取系统当前时间
////        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////        String timeStr = df.format(time);
////        time = Timestamp.valueOf(timeStr);
////        tbShoppingcart.setCreateTime(time);
////        tbShoppingcart.setUpdateTime(time);
////
////        return shoppingCartService.saveOrUpdate(tbShoppingcart);
//        return false;
//
//    }
//
//
//}
