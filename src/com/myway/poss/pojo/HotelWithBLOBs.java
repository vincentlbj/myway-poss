package com.myway.poss.pojo;

public class HotelWithBLOBs extends Hotel {
    private String introduction;

    private String installation;

    private String policy;

    private String around;

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getInstallation() {
        return installation;
    }

    public void setInstallation(String installation) {
        this.installation = installation == null ? null : installation.trim();
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy == null ? null : policy.trim();
    }

    public String getAround() {
        return around;
    }

    public void setAround(String around) {
        this.around = around == null ? null : around.trim();
    }
}