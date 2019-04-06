package com.holding.po;

public class Floor {
    private Integer id;

    private Integer libraryid;

    private String name;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLibraryid() {
        return libraryid;
    }

    public void setLibraryid(Integer libraryid) {
        this.libraryid = libraryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}