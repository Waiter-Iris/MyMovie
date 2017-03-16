package com.yztc.mymovie.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Video entity. @author MyEclipse Persistence Tools
 */

public class Video  implements java.io.Serializable {


    // Fields    

     private Integer videoId;
     private Users users;
     private Vtype vtype;
     private Date videoDate;
     private BigDecimal videoTimes;
     private String videoName;
     private String videoAddress;
     private BigDecimal videoStatus;
     private String videoImg;
     private Set remarks = new HashSet(0);
     private Set histories = new HashSet(0);


    // Constructors

    /** default constructor */
    public Video() {
    }

    
    /** full constructor */
    public Video(Users users, Vtype vtype, Date videoDate, BigDecimal videoTimes, String videoName, String videoAddress, BigDecimal videoStatus, String videoImg, Set remarks, Set histories) {
        this.users = users;
        this.vtype = vtype;
        this.videoDate = videoDate;
        this.videoTimes = videoTimes;
        this.videoName = videoName;
        this.videoAddress = videoAddress;
        this.videoStatus = videoStatus;
        this.videoImg = videoImg;
        this.remarks = remarks;
        this.histories = histories;
    }

   
    // Property accessors

    public Integer getVideoId() {
        return this.videoId;
    }
    
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }

    public Vtype getVtype() {
        return this.vtype;
    }
    
    public void setVtype(Vtype vtype) {
        this.vtype = vtype;
    }

    public Date getVideoDate() {
        return this.videoDate;
    }
    
    public void setVideoDate(Date videoDate) {
        this.videoDate = videoDate;
    }

    public BigDecimal getVideoTimes() {
        return this.videoTimes;
    }
    
    public void setVideoTimes(BigDecimal videoTimes) {
        this.videoTimes = videoTimes;
    }

    public String getVideoName() {
        return this.videoName;
    }
    
    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoAddress() {
        return this.videoAddress;
    }
    
    public void setVideoAddress(String videoAddress) {
        this.videoAddress = videoAddress;
    }

    public BigDecimal getVideoStatus() {
        return this.videoStatus;
    }
    
    public void setVideoStatus(BigDecimal videoStatus) {
        this.videoStatus = videoStatus;
    }

    public String getVideoImg() {
        return this.videoImg;
    }
    
    public void setVideoImg(String videoImg) {
        this.videoImg = videoImg;
    }

    public Set getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(Set remarks) {
        this.remarks = remarks;
    }

    public Set getHistories() {
        return this.histories;
    }
    
    public void setHistories(Set histories) {
        this.histories = histories;
    }
   








}