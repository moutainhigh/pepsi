package com.zking.erp.model.jhui;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Functions implements Serializable{
    private String id;

    private String number;

    private String name;

    private String pnumber;

    private String url;

    private Boolean state;

    private String sort;

    private Boolean enabled;

    private String type;

    private String pushbtn;

    /**
     * 用户IP，用户记录操作日志
     */
    private String clientIp = "";

    /**
     * UBType，UserBusiness类型
     */
    private String UBType = "";

    /**
     * UBKeyId，UserBusiness关键id
     */
    private String UBKeyId = "";

    /**
     * 分类ID
     */
    private String functionsID = "01";

    /**
     * 分类IDs 批量操作使用
     */
    private String functionsIDs = "";

    private String[] ids=null;

    public Functions(String id, String number, String name, String pnumber, String url, Boolean state, String sort, Boolean enabled, String type, String pushbtn) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.pnumber = pnumber;
        this.url = url;
        this.state = state;
        this.sort = sort;
        this.enabled = enabled;
        this.type = type;
        this.pushbtn = pushbtn;
    }

    public Functions() {
        super();
    }

    public String[] getIds() {
        return ids;
    }

    public void setIds(String[] ids) {
        this.ids = ids;
    }

    public String getFunctionsID() {
        return functionsID;
    }

    public void setFunctionsID(String functionsID) {
        this.functionsID = functionsID;
    }

    public String getFunctionsIDs() {
        return functionsIDs;
    }

    public void setFunctionsIDs(String functionsIDs) {
        this.functionsIDs = functionsIDs;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getUBType() {
        return UBType;
    }

    public void setUBType(String UBType) {
        this.UBType = UBType;
    }

    public String getUBKeyId() {
        return UBKeyId;
    }

    public void setUBKeyId(String UBKeyId) {
        this.UBKeyId = UBKeyId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPushbtn() {
        return pushbtn;
    }

    public void setPushbtn(String pushbtn) {
        this.pushbtn = pushbtn;
    }

    public Functions(String pnumber) {
        this.pnumber = pnumber;
    }

    @Override
    public String toString() {
        return "Functions{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", pnumber='" + pnumber + '\'' +
                ", url='" + url + '\'' +
                ", state=" + state +
                ", sort='" + sort + '\'' +
                ", enabled=" + enabled +
                ", type='" + type + '\'' +
                ", pushbtn='" + pushbtn + '\'' +
                '}';
    }
}