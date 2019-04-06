package com.holding.po;

public class Desk {
    private Integer id;

    private Integer xaxis;

    private Integer yaxis;

    private Integer width;

    private Integer height;

    private Integer xmaxnum;

    private Integer ymaxnum;

    private String name;

    private Integer roomid;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getXaxis() {
        return xaxis;
    }

    public void setXaxis(Integer xaxis) {
        this.xaxis = xaxis;
    }

    public Integer getYaxis() {
        return yaxis;
    }

    public void setYaxis(Integer yaxis) {
        this.yaxis = yaxis;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getXmaxnum() {
        return xmaxnum;
    }

    public void setXmaxnum(Integer xmaxnum) {
        this.xmaxnum = xmaxnum;
    }

    public Integer getYmaxnum() {
        return ymaxnum;
    }

    public void setYmaxnum(Integer ymaxnum) {
        this.ymaxnum = ymaxnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}