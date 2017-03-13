// default package

import java.math.BigDecimal;
import java.util.Date;


/**
 * History entity. @author MyEclipse Persistence Tools
 */

public class History  implements java.io.Serializable {


    // Fields    

     private BigDecimal historyId;
     private BigDecimal userId;
     private BigDecimal videoId;
     private Date historyDate;
     private String historyPlaytime;
     private BigDecimal historyStatus;
     private BigDecimal managerVideoId;


    // Constructors

    /** default constructor */
    public History() {
    }

    
    /** full constructor */
    public History(BigDecimal userId, BigDecimal videoId, Date historyDate, String historyPlaytime, BigDecimal historyStatus, BigDecimal managerVideoId) {
        this.userId = userId;
        this.videoId = videoId;
        this.historyDate = historyDate;
        this.historyPlaytime = historyPlaytime;
        this.historyStatus = historyStatus;
        this.managerVideoId = managerVideoId;
    }

   
    // Property accessors

    public BigDecimal getHistoryId() {
        return this.historyId;
    }
    
    public void setHistoryId(BigDecimal historyId) {
        this.historyId = historyId;
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

    public Date getHistoryDate() {
        return this.historyDate;
    }
    
    public void setHistoryDate(Date historyDate) {
        this.historyDate = historyDate;
    }

    public String getHistoryPlaytime() {
        return this.historyPlaytime;
    }
    
    public void setHistoryPlaytime(String historyPlaytime) {
        this.historyPlaytime = historyPlaytime;
    }

    public BigDecimal getHistoryStatus() {
        return this.historyStatus;
    }
    
    public void setHistoryStatus(BigDecimal historyStatus) {
        this.historyStatus = historyStatus;
    }

    public BigDecimal getManagerVideoId() {
        return this.managerVideoId;
    }
    
    public void setManagerVideoId(BigDecimal managerVideoId) {
        this.managerVideoId = managerVideoId;
    }
   








}