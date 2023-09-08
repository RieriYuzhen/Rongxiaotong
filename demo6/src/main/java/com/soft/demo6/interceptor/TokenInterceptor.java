package com.soft.demo6.interceptor;

import com.soft.demo6.utils.JwtTokenUtil;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//JWT验证 暂时没写好
public class TokenInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler)throws Exception{
        String token = request.getHeader("token");
        if(!JwtTokenUtil.checkToken(token)){
            return  false;//验证失败，无论超时或者什么原因
        }
        return  true;//验证成功
    }
}
