package com.myway.poss.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TourOrder {
    private Integer oId;

    private Integer uId;

    private Integer people;

    private String oType;

    private Integer pId;

    private Date oDate;

    private String token;

    private BigDecimal price;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public String getoType() {
        return oType;
    }

    public void setoType(String oType) {
        this.oType = oType == null ? null : oType.trim();
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Date getoDate() {
        return oDate;
    }

    public void setoDate(Date oDate) {
        this.oDate = oDate;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}