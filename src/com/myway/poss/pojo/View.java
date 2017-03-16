package com.myway.poss.pojo;

public class View {
    private Integer pId;

    private String viewName;

    private String picture;

    private Integer price;

    private Float remark;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName == null ? null : viewName.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Float getRemark() {
        return remark;
    }

    public void setRemark(Float remark) {
        this.remark = remark;
    }
}