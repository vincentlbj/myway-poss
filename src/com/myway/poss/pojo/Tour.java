package com.myway.poss.pojo;

public class Tour {
    private Integer id;

    private String productId;

    private String name;

    private String subname;

    private String taocan;

    private String during;

    private Integer price;

    private String picture;

    private Float remark;

    private Integer comment;

    private Integer deal;

    private Integer satisfactory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname == null ? null : subname.trim();
    }

    public String getTaocan() {
        return taocan;
    }

    public void setTaocan(String taocan) {
        this.taocan = taocan == null ? null : taocan.trim();
    }

    public String getDuring() {
        return during;
    }

    public void setDuring(String during) {
        this.during = during == null ? null : during.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public Integer getDeal() {
        return deal;
    }

    public void setDeal(Integer deal) {
        this.deal = deal;
    }

    public Integer getSatisfactory() {
        return satisfactory;
    }

    public void setSatisfactory(Integer satisfactory) {
        this.satisfactory = satisfactory;
    }
}