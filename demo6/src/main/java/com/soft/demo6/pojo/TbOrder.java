package com.soft.demo6.pojo;


import com.baomidou.mybatisplus.annotation.TableId;

public class TbOrder {
@TableId
  private long orderId;
  private String title;
  private double price;
  private String content;
  private long orderStatus;
  private String type;
  private String picture;
  private String ownName;
  private String cooperationName;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private String address;


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public long getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(long orderStatus) {
    this.orderStatus = orderStatus;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }


  public String getOwnName() {
    return ownName;
  }

  public void setOwnName(String ownName) {
    this.ownName = ownName;
  }


  public String getCooperationName() {
    return cooperationName;
  }

  public void setCooperationName(String cooperationName) {
    this.cooperationName = cooperationName;
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


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

}
