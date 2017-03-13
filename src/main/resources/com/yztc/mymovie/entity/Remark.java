// default package

import java.math.BigDecimal;
import java.util.Date;


/**
 * Remark entity. @author MyEclipse Persistence Tools
 */

public class Remark  implements java.io.Serializable {


    // Fields    

     private BigDecimal remarkId;
     private BigDecimal userId;
     private BigDecimal videoId;
     private Date remarkDate;
     private String remarkContent;
     private BigDecimal remarkStatus;
     private BigDecimal managerVideoId;


    // Constructors

    /** default constructor */
    public Remark() {
    }

    
    /** full constructor */
    public Remark(BigDecimal userId, BigDecimal videoId, Date remarkDate, String remarkContent, BigDecimal remarkStatus, BigDecimal managerVideoId) {
        this.userId = userId;
        this.videoId = videoId;
        this.remarkDate = remarkDate;
        this.remarkContent = remarkContent;
        this.remarkStatus = remarkStatus;
        this.managerVideoId = managerVideoId;
    }

   
    // Property accessors

    public BigDecimal getRemarkId() {
        return this.remarkId;
    }
    
    public void setRemarkId(BigDecimal remarkId) {
        this.remarkId = remarkId;
    }

    public BigDecimal getUserId() {
        return this.userId;
    }
    
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigDecimal getVideoId() {
        return this.videoId;
    }
    
    public void setVideoId(BigDecimal videoId) {
        this.videoId = videoId;
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

    public BigDecimal getManagerVideoId() {
        return this.managerVideoId;
    }
    
    public void setManagerVideoId(BigDecimal managerVideoId) {
        this.managerVideoId = managerVideoId;
    }
   








}