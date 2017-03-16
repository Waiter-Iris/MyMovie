package com.yztc.mymovie.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users  implements java.io.Serializable {


    // Fields    

     private BigDecimal userId;
     private String userName;
     private String userPassword;
     private String userEmail;
     private String userPhone;
     private BigDecimal userVip;
     private Date vipStart;
     private Date vipEnd;
     private String userImg;
     private BigDecimal userStatus;
     private Set videos = new HashSet(0);
     private Set remarks = new HashSet(0);
     private Set notifies = new HashSet(0);
     private Set histories = new HashSet(0);


    // Constructors

    /** default constructor */
    public Users() {
    }

    
    /** full constructor */
    public Users(String userName, String userPassword, String userEmail, String userPhone, BigDecimal userVip, Date vipStart, Date vipEnd, String userImg, BigDecimal userStatus, Set videos, Set remarks, Set notifies, Set histories) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userVip = userVip;
        this.vipStart = vipStart;
        this.vipEnd = vipEnd;
        this.userImg = userImg;
        this.videos = videos;
        this.remarks = remarks;
        this.notifies = notifies;
        this.histories = histories;
        this.userStatus = userStatus;
    }

   
    // Property accessors

    public BigDecimal getUserId() {
        return this.userId;
    }
    
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    
    public BigDecimal getUserStatus() {
		return userStatus;
	}


	public void setUserStatus(BigDecimal userStatus) {
		this.userStatus = userStatus;
	}


	public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return this.userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return this.userEmail;
    }
    
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return this.userPhone;
    }
    
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public BigDecimal getUserVip() {
        return this.userVip;
    }
    
    public void setUserVip(BigDecimal userVip) {
        this.userVip = userVip;
    }

    public Date getVipStart() {
        return this.vipStart;
    }
    
    public void setVipStart(Date vipStart) {
        this.vipStart = vipStart;
    }

    public Date getVipEnd() {
        return this.vipEnd;
    }
    
    public void setVipEnd(Date vipEnd) {
        this.vipEnd = vipEnd;
    }

    public String getUserImg() {
        return this.userImg;
    }
    
    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public Set getVideos() {
        return this.videos;
    }
    
    public void setVideos(Set videos) {
        this.videos = videos;
    }

    public Set getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(Set remarks) {
        this.remarks = remarks;
    }

    public Set getNotifies() {
        return this.notifies;
    }
    
    public void setNotifies(Set notifies) {
        this.notifies = notifies;
    }

    public Set getHistories() {
        return this.histories;
    }
    
    public void setHistories(Set histories) {
        this.histories = histories;
    }
   








}