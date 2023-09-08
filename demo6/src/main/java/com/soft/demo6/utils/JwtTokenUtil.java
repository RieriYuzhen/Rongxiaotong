package com.soft.demo6.utils;

import io.jsonwebtoken.*;
import org.junit.Test;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.support.JstlUtils;

import java.util.Date;
import java.util.UUID;

import static java.lang.System.currentTimeMillis;

//Jwt工具类

public class JwtTokenUtil {
    private static long time = 1000*15;
    private static String sign = "admin";
    @Test
    public static String createToken(){
        JwtBuilder jwtBuilder = Jwts.builder();
        String jwtToken = jwtBuilder
                .setHeaderParam("typ","JWT")
                .setHeaderParam("alg","HS256")
                .claim("username","tom")
                .claim("role","admin")
                .setSubject("admin-test")
                .setExpiration(new Date(currentTimeMillis()+ time ))
                .setId(UUID.randomUUID().toString())
                .signWith(SignatureAlgorithm.HS256,sign)
                .compact();
        return jwtToken;
//eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6InRvbSIsInJvbGUiOiJhZG1pbiIsInN1YiI6ImFkbWluLXRlc3QiLCJleHAiOjE2OTQwOTc1MjUsImp0aSI6ImE4Nzc5YzAwLTM5Y2EtNDBlMy04NzczLWRlYTE4ZGZjZjg3MyJ9.IRp37byoBB_OLyu7JrVxC9Z4wMPF5gPaUe3mEYp1UhE
    }
    @Test
    @PostMapping
    public static boolean checkToken(String token) {
        if (token == null || token == "") {
            return false;
        }
        try {
            Jws<Claims> claimsJws = Jwts.parser().setSigningKey(sign).parseClaimsJws(token);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return  true;
    }
    @Test
    public void parseJwt(String token){
//        String token ="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6InRvbSIsInJvbGUiOiJhZG1pbiIsInN1YiI6ImFkbWluLXRlc3QiLCJleHAiOjE2OTQwOTc1MjUsImp0aSI6ImE4Nzc5YzAwLTM5Y2EtNDBlMy04NzczLWRlYTE4ZGZjZjg3MyJ9.IRp37byoBB_OLyu7JrVxC9Z4wMPF5gPaUe3mEYp1UhE";
        JwtParser jwtParser = Jwts.parser();
        Jws<Claims>claimsJws = jwtParser.setSigningKey(sign).parseClaimsJws(token);
        Claims claims = claimsJws.getBody();//获取username和password
//        System.out.println(claims.get("username"));
//        System.out.println(claims.get("role"));
//        System.out.println(claims.getId());
//        System.out.println(claims.getSubject());
//        System.out.println(claims.getExpiration());
    }
}
