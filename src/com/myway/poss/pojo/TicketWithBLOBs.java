package com.myway.poss.pojo;

public class TicketWithBLOBs extends Ticket {
    private String bookNotice;

    private String spotSummary;

    public String getBookNotice() {
        return bookNotice;
    }

    public void setBookNotice(String bookNotice) {
        this.bookNotice = bookNotice == null ? null : bookNotice.trim();
    }

    public String getSpotSummary() {
        return spotSummary;
    }

    public void setSpotSummary(String spotSummary) {
        this.spotSummary = spotSummary == null ? null : spotSummary.trim();
    }
}