package com.myway.poss.pojo;

public class TourWithBLOBs extends Tour {
    private String introduction;

    private String routeInclude;

    private String routeContent;

    private String notice;

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getRouteInclude() {
        return routeInclude;
    }

    public void setRouteInclude(String routeInclude) {
        this.routeInclude = routeInclude == null ? null : routeInclude.trim();
    }

    public String getRouteContent() {
        return routeContent;
    }

    public void setRouteContent(String routeContent) {
        this.routeContent = routeContent == null ? null : routeContent.trim();
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }
}