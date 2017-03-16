package com.yztc.mymovie.entity;

import java.math.BigDecimal;


/**
 * Notify entity. @author MyEclipse Persistence Tools
 */

public class Notify  implements java.io.Serializable {


    // Fields    

     private BigDecimal notifyId;
     private Users users;
     private String notifyContent;
     private BigDecimal notifyStatus;


    // Constructors

    /** default constructor */
    public Notify() {
    }

    
    /** full constructor */
    public Notify(Users users, String notifyContent, BigDecimal notifyStatus) {
        this.users = users;
        this.notifyContent = notifyContent;
        this.notifyStatus = notifyStatus;
    }

   
    // Property accessors

    public BigDecimal getNotifyId() {
        return this.notifyId;
    }
    
    public void setNotifyId(BigDecimal notifyId) {
        this.notifyId = notifyId;
    }

    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }

    public String getNotifyContent() {
        return this.notifyContent;
    }
    
    public void setNotifyContent(String notifyContent) {
        this.notifyContent = notifyContent;
    }

    public BigDecimal getNotifyStatus() {
        return this.notifyStatus;
    }
    
    public void setNotifyStatus(BigDecimal notifyStatus) {
        this.notifyStatus = notifyStatus;
    }
   








}