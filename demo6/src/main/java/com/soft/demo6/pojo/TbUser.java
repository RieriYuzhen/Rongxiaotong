package com.soft.demo6.pojo;

import lombok.Data;

import java.io.Serializable;

public class TbUser implements Serializable {

  private String userName;
  private String password;
  private String nickName;
  private String phone;
  private String identityNum;
  private String address;
  private String role;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long integral;
  private long credit;
  private String avatar;
  private String realName;
  private String token;

  public String getUserName() {
    return userName;
  }

  public String getToken(){return token;}

  public void setToken(String token){this.token = token;}

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getIdentityNum() {
    return identityNum;
  }

  public void setIdentityNum(String identityNum) {
    this.identityNum = identityNum;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public long getIntegral() {
    return integral;
  }

  public void setIntegral(long integral) {
    this.integral = integral;
  }


  public long getCredit() {
    return credit;
  }

  public void setCredit(long credit) {
    this.credit = credit;
  }


  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  @Override
  public String toString() {
    return "TbUser{" +
            "userName='" + userName + '\'' +
            ", password='" + password + '\'' +
            ", nickName='" + nickName + '\'' +
            ", phone='" + phone + '\'' +
            ", identityNum='" + identityNum + '\'' +
            ", address='" + address + '\'' +
            ", role='" + role + '\'' +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", integral=" + integral +
            ", credit=" + credit +
            ", avatar='" + avatar + '\'' +
            ", realName='" + realName + '\'' +
            ", token = '" + token + '\''+
            '}';
  }
}
