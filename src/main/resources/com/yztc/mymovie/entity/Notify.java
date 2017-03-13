// default package

import java.math.BigDecimal;


/**
 * Notify entity. @author MyEclipse Persistence Tools
 */

public class Notify  implements java.io.Serializable {


    // Fields    

     private BigDecimal notifyId;
     private BigDecimal userId;
     private String notifyContent;
     private BigDecimal notifyStatus;


    // Constructors

    /** default constructor */
    public Notify() {
    }

    
    /** full constructor */
    public Notify(BigDecimal userId, String notifyContent, BigDecimal notifyStatus) {
        this.userId = userId;
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

    public BigDecimal getUserId() {
        return this.userId;
    }
    
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
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