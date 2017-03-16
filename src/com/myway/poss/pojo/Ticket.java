package com.myway.poss.pojo;

import java.math.BigDecimal;

public class Ticket {
    private Integer id;

    private String name;

    private String address;

    private String level;

    private String openDate;

    private String headerPicture;

    private String picture;

    private String baiduPoint;

    private String trafficMessage;

    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate == null ? null : openDate.trim();
    }

    public String getHeaderPicture() {
        return headerPicture;
    }

    public void setHeaderPicture(String headerPicture) {
        this.headerPicture = headerPicture == null ? null : headerPicture.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getBaiduPoint() {
        return baiduPoint;
    }

    public void setBaiduPoint(String baiduPoint) {
        this.baiduPoint = baiduPoint == null ? null : baiduPoint.trim();
    }

    public String getTrafficMessage() {
        return trafficMessage;
    }

    public void setTrafficMessage(String trafficMessage) {
        this.trafficMessage = trafficMessage == null ? null : trafficMessage.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}