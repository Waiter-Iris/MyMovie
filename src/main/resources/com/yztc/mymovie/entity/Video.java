// default package

import java.math.BigDecimal;
import java.util.Date;


/**
 * Video entity. @author MyEclipse Persistence Tools
 */

public class Video  implements java.io.Serializable {


    // Fields    

     private BigDecimal videoId;
     private BigDecimal userId;
     private BigDecimal vtypeId;
     private Date videoDate;
     private BigDecimal videoTimes;
     private String videoName;
     private String videoAddress;
     private BigDecimal videoStatus;
     private String videoImg;


    // Constructors

    /** default constructor */
    public Video() {
    }

    
    /** full constructor */
    public Video(BigDecimal userId, BigDecimal vtypeId, Date videoDate, BigDecimal videoTimes, String videoName, String videoAddress, BigDecimal videoStatus, String videoImg) {
        this.userId = userId;
        this.vtypeId = vtypeId;
        this.videoDate = videoDate;
        this.videoTimes = videoTimes;
        this.videoName = videoName;
        this.videoAddress = videoAddress;
        this.videoStatus = videoStatus;
        this.videoImg = videoImg;
    }

   
    // Property accessors

    public BigDecimal getVideoId() {
        return this.videoId;
    }
    
    public void setVideoId(BigDecimal videoId) {
        this.videoId = videoId;
    }

    public BigDecimal getUserId() {
        return this.userId;
    }
    
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigDecimal getVtypeId() {
        return this.vtypeId;
    }
    
    public void setVtypeId(BigDecimal vtypeId) {
        this.vtypeId = vtypeId;
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
   








}