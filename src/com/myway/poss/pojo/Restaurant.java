package com.myway.poss.pojo;

public class Restaurant {
    private Integer pId;

    private Float avgConsume;

    private String restaurantName;

    private String picture;

    private Float remark;

    private String introduction;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Float getAvgConsume() {
        return avgConsume;
    }

    public void setAvgConsume(Float avgConsume) {
        this.avgConsume = avgConsume;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName == null ? null : restaurantName.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Float getRemark() {
        return remark;
    }

    public void setRemark(Float remark) {
        this.remark = remark;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}