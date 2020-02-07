package com.hancher.demo.sharding.jdbc.repository.entity;

public class OrderLevelEntity {
    private Integer id;

    private String levelCode;

    private String levelName;

    private Integer level;

    private String parentLevelCode;

    private Integer isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode == null ? null : levelCode.trim();
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getParentLevelCode() {
        return parentLevelCode;
    }

    public void setParentLevelCode(String parentLevelCode) {
        this.parentLevelCode = parentLevelCode == null ? null : parentLevelCode.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}