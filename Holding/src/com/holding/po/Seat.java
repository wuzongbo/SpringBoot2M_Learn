package com.holding.po;

public class Seat {
    private Integer id;

    private Integer floorid;

    private Integer roomid;

    private Integer deskid;

    private String name;

    private Integer xaxis;

    private Integer yaxis;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFloorid() {
        return floorid;
    }

    public void setFloorid(Integer floorid) {
        this.floorid = floorid;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getDeskid() {
        return deskid;
    }

    public void setDeskid(Integer deskid) {
        this.deskid = deskid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}