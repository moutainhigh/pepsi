package com.zking.erp.model.jhui;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@ToString
public class DepotHead implements Serializable{
    private String id;

    private String type;

    private String subtype;

    private String projectid;

    private String defaultnumber;

    private String checker;

    private String number;

    private String operpersonname;

    private Date checktime;

    private Date createtime;

    private Date opertime;
    private String StrOpertime;

    private String organid;

    private String handspersonid;

    private String accountid;

    private Double changeamount;

    private String allocationprojectid;

    private Double totalprice;

    private String paytype;

    private String remark;

    private String salesman;

    private String accountidlist;

    private String accountmoneylist;

    private Double discount;

    private Double discountmoney;

    private Double discountlastmoney;

    private Double othermoney;

    private String othermoneylist;

    private String othermoneyitem;

    private Integer accountday;

    private Integer status;

    //查询开始时间
    private String BeginTime;
    //查询结束时间
    private String EndTime;
    //查询月份
    private String MonthTime;
    //单位Id，用于查询单位的应收应付
    private String supplierId;
    //商品参数
    private String MaterialParam;
    //单据id列表
    private String dhIds;
    //单位类型，客户、供应商
    private String supType;

    /**
     * 分类ID
     */
    private String depotHeadID = "0";

    /**
     * 分类IDs 批量操作使用
     */
    private String depotHeadIDs = "";

    private String[] ids=null;

    ///拥有的仓库信息
   private String DepotIds="";

    /**
     * 用户IP，用户记录操作日志
     */
    private String clientIp = "";

    private String ProjectName;//仓库Depot
    private String OrganName;//供应商 Supplier
    private String HandsPersonName;//经手人 Person
    private String AccountName; //账户 Account
    private String AllocationProjectName;//调拨时对方仓库Depot

    private String mName;//商品信息

    public DepotHead(String id, String type, String subtype, String projectid, String defaultnumber, String checker, String number, String operpersonname, Date checktime, Date createtime, Date opertime, String organid, String handspersonid, String accountid, Double changeamount, String allocationprojectid, Double totalprice, String paytype, String remark, String salesman, String accountidlist, String accountmoneylist, Double discount, Double discountmoney, Double discountlastmoney, Double othermoney, String othermoneylist, String othermoneyitem, Integer accountday, Integer status) {
        this.id = id;
        this.type = type;
        this.subtype = subtype;
        this.projectid = projectid;
        this.defaultnumber = defaultnumber;
        this.checker = checker;
        this.number = number;
        this.operpersonname = operpersonname;
        this.checktime = checktime;
        this.createtime = createtime;
        this.opertime = opertime;
        this.organid = organid;
        this.handspersonid = handspersonid;
        this.accountid = accountid;
        this.changeamount = changeamount;
        this.allocationprojectid = allocationprojectid;
        this.totalprice = totalprice;
        this.paytype = paytype;
        this.remark = remark;
        this.salesman = salesman;
        this.accountidlist = accountidlist;
        this.accountmoneylist = accountmoneylist;
        this.discount = discount;
        this.discountmoney = discountmoney;
        this.discountlastmoney = discountlastmoney;
        this.othermoney = othermoney;
        this.othermoneylist = othermoneylist;
        this.othermoneyitem = othermoneyitem;
        this.accountday = accountday;
        this.status = status;
    }

    public DepotHead() {
        super();
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public String getOrganName() {
        return OrganName;
    }

    public void setOrganName(String organName) {
        OrganName = organName;
    }

    public String getHandsPersonName() {
        return HandsPersonName;
    }

    public void setHandsPersonName(String handsPersonName) {
        HandsPersonName = handsPersonName;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public String getAllocationProjectName() {
        return AllocationProjectName;
    }

    public void setAllocationProjectName(String allocationProjectName) {
        AllocationProjectName = allocationProjectName;
    }

    public String getDepotIds() {
        return DepotIds;
    }

    public void setDepotIds(String depotIds) {
        DepotIds = depotIds;
    }

    public String getStrOpertime() {
        return StrOpertime;
    }

    public void setStrOpertime(String strOpertime) {
        StrOpertime = strOpertime;
    }

    public String getBeginTime() {
        return BeginTime;
    }

    public void setBeginTime(String beginTime) {
        BeginTime = beginTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getMonthTime() {
        return MonthTime;
    }

    public void setMonthTime(String monthTime) {
        MonthTime = monthTime;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getMaterialParam() {
        return MaterialParam;
    }

    public void setMaterialParam(String materialParam) {
        MaterialParam = materialParam;
    }

    public String getDhIds() {
        return dhIds;
    }

    public void setDhIds(String dhIds) {
        this.dhIds = dhIds;
    }

    public String getSupType() {
        return supType;
    }

    public void setSupType(String supType) {
        this.supType = supType;
    }

    public String getDepotHeadID() {
        return depotHeadID;
    }

    public void setDepotHeadID(String depotHeadID) {
        this.depotHeadID = depotHeadID;
    }

    public String getDepotHeadIDs() {
        return depotHeadIDs;
    }

    public void setDepotHeadIDs(String depotHeadIDs) {
        this.depotHeadIDs = depotHeadIDs;
    }

    public String[] getIds() {
        return ids;
    }

    public void setIds(String[] ids) {
        this.ids = ids;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public String getDefaultnumber() {
        return defaultnumber;
    }

    public void setDefaultnumber(String defaultnumber) {
        this.defaultnumber = defaultnumber;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOperpersonname() {
        return operpersonname;
    }

    public void setOperpersonname(String operpersonname) {
        this.operpersonname = operpersonname;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getOrganid() {
        return organid;
    }

    public void setOrganid(String organid) {
        this.organid = organid;
    }

    public String getHandspersonid() {
        return handspersonid;
    }

    public void setHandspersonid(String handspersonid) {
        this.handspersonid = handspersonid;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public Double getChangeamount() {
        return changeamount;
    }

    public void setChangeamount(Double changeamount) {
        this.changeamount = changeamount;
    }

    public String getAllocationprojectid() {
        return allocationprojectid;
    }

    public void setAllocationprojectid(String allocationprojectid) {
        this.allocationprojectid = allocationprojectid;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getAccountidlist() {
        return accountidlist;
    }

    public void setAccountidlist(String accountidlist) {
        this.accountidlist = accountidlist;
    }

    public String getAccountmoneylist() {
        return accountmoneylist;
    }

    public void setAccountmoneylist(String accountmoneylist) {
        this.accountmoneylist = accountmoneylist;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getDiscountmoney() {
        return discountmoney;
    }

    public void setDiscountmoney(Double discountmoney) {
        this.discountmoney = discountmoney;
    }

    public Double getDiscountlastmoney() {
        return discountlastmoney;
    }

    public void setDiscountlastmoney(Double discountlastmoney) {
        this.discountlastmoney = discountlastmoney;
    }

    public Double getOthermoney() {
        return othermoney;
    }

    public void setOthermoney(Double othermoney) {
        this.othermoney = othermoney;
    }

    public String getOthermoneylist() {
        return othermoneylist;
    }

    public void setOthermoneylist(String othermoneylist) {
        this.othermoneylist = othermoneylist;
    }

    public String getOthermoneyitem() {
        return othermoneyitem;
    }

    public void setOthermoneyitem(String othermoneyitem) {
        this.othermoneyitem = othermoneyitem;
    }

    public Integer getAccountday() {
        return accountday;
    }

    public void setAccountday(Integer accountday) {
        this.accountday = accountday;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DepotHead{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", subtype='" + subtype + '\'' +
                ", projectid='" + projectid + '\'' +
                ", defaultnumber='" + defaultnumber + '\'' +
                ", checker='" + checker + '\'' +
                ", number='" + number + '\'' +
                ", operpersonname='" + operpersonname + '\'' +
                ", checktime=" + checktime +
                ", createtime=" + createtime +
                ", opertime=" + opertime +
                ", organid='" + organid + '\'' +
                ", handspersonid='" + handspersonid + '\'' +
                ", accountid='" + accountid + '\'' +
                ", changeamount=" + changeamount +
                ", allocationprojectid='" + allocationprojectid + '\'' +
                ", totalprice=" + totalprice +
                ", paytype='" + paytype + '\'' +
                ", remark='" + remark + '\'' +
                ", salesman='" + salesman + '\'' +
                ", accountidlist='" + accountidlist + '\'' +
                ", accountmoneylist='" + accountmoneylist + '\'' +
                ", discount=" + discount +
                ", discountmoney=" + discountmoney +
                ", discountlastmoney=" + discountlastmoney +
                ", othermoney=" + othermoney +
                ", othermoneylist='" + othermoneylist + '\'' +
                ", othermoneyitem='" + othermoneyitem + '\'' +
                ", accountday=" + accountday +
                ", status=" + status +
                '}';
    }
}