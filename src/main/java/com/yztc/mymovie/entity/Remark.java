package com.yztc.mymovie.entity;

import java.math.BigDecimal;
import java.util.Date;


/**
 * Remark entity. @author MyEclipse Persistence Tools
 */

public class Remark  implements java.io.Serializable {


    // Fields    

     private BigDecimal remarkId;
     private Video video;
     private Users users;
     private ManagerVideo managerVideo;
     private Date remarkDate;
     private String remarkContent;
     private BigDecimal remarkStatus;


    // Constructors

    /** default constructor */
    public Remark() {
    }

    
    /** full constructor */
    public Remark(Video video, Users users, ManagerVideo managerVideo, Date remarkDate, String remarkContent, BigDecimal remarkStatus) {
        this.video = video;
        this.users = users;
        this.managerVideo = managerVideo;
        this.remarkDate = remarkDate;
        this.remarkContent = remarkContent;
        this.remarkStatus = remarkStatus;
    }

   
    // Property accessors

    public BigDecimal getRemarkId() {
        return this.remarkId;
    }
    
    public void setRemarkId(BigDecimal remarkId) {
        this.remarkId = remarkId;
    }

    public Video getVideo() {
        return this.video;
    }
    
    public void setVideo(Video video) {
        this.video = video;
    }

    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }

    public ManagerVideo getManagerVideo() {
        return this.managerVideo;
    }
    
    public void setManagerVideo(ManagerVideo managerVideo) {
        this.managerVideo = managerVideo;
    }

    public Date getRemarkDate() {
        return this.remarkDate;
    }
    
    public void setRemarkDate(Date remarkDate) {
        this.remarkDate = remarkDate;
    }

    public String getRemarkContent() {
        return this.remarkContent;
    }
    
    public void setRemarkContent(String remarkContent) {
        this.remarkContent = remarkContent;
    }

    public BigDecimal getRemarkStatus() {
        return this.remarkStatus;
    }
    
    public void setRemarkStatus(BigDecimal remarkStatus) {
        this.remarkStatus = remarkStatus;
    }
   








}