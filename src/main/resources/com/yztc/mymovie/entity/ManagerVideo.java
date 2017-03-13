// default package

import java.math.BigDecimal;
import java.util.Date;


/**
 * ManagerVideo entity. @author MyEclipse Persistence Tools
 */

public class ManagerVideo  implements java.io.Serializable {


    // Fields    

     private BigDecimal managerVideoId;
     private BigDecimal vtypeId;
     private Date managerVideoDate;
     private String managerVideoName;
     private String managerVideoInfo;
     private String managerVideoActors;
     private String managerVideoDirector;
     private BigDecimal managerVideoTimes;
     private BigDecimal vipStatus;
     private String managerVideoAddress;
     private String managerVideoImg;


    // Constructors

    /** default constructor */
    public ManagerVideo() {
    }

    
    /** full constructor */
    public ManagerVideo(BigDecimal vtypeId, Date managerVideoDate, String managerVideoName, String managerVideoInfo, String managerVideoActors, String managerVideoDirector, BigDecimal managerVideoTimes, BigDecimal vipStatus, String managerVideoAddress, String managerVideoImg) {
        this.vtypeId = vtypeId;
        this.managerVideoDate = managerVideoDate;
        this.managerVideoName = managerVideoName;
        this.managerVideoInfo = managerVideoInfo;
        this.managerVideoActors = managerVideoActors;
        this.managerVideoDirector = managerVideoDirector;
        this.managerVideoTimes = managerVideoTimes;
        this.vipStatus = vipStatus;
        this.managerVideoAddress = managerVideoAddress;
        this.managerVideoImg = managerVideoImg;
    }

   
    // Property accessors

    public BigDecimal getManagerVideoId() {
        return this.managerVideoId;
    }
    
    public void setManagerVideoId(BigDecimal managerVideoId) {
        this.managerVideoId = managerVideoId;
    }

    public BigDecimal getVtypeId() {
        return this.vtypeId;
    }
    
    public void setVtypeId(BigDecimal vtypeId) {
        this.vtypeId = vtypeId;
    }

    public Date getManagerVideoDate() {
        return this.managerVideoDate;
    }
    
    public void setManagerVideoDate(Date managerVideoDate) {
        this.managerVideoDate = managerVideoDate;
    }

    public String getManagerVideoName() {
        return this.managerVideoName;
    }
    
    public void setManagerVideoName(String managerVideoName) {
        this.managerVideoName = managerVideoName;
    }

    public String getManagerVideoInfo() {
        return this.managerVideoInfo;
    }
    
    public void setManagerVideoInfo(String managerVideoInfo) {
        this.managerVideoInfo = managerVideoInfo;
    }

    public String getManagerVideoActors() {
        return this.managerVideoActors;
    }
    
    public void setManagerVideoActors(String managerVideoActors) {
        this.managerVideoActors = managerVideoActors;
    }

    public String getManagerVideoDirector() {
        return this.managerVideoDirector;
    }
    
    public void setManagerVideoDirector(String managerVideoDirector) {
        this.managerVideoDirector = managerVideoDirector;
    }

    public BigDecimal getManagerVideoTimes() {
        return this.managerVideoTimes;
    }
    
    public void setManagerVideoTimes(BigDecimal managerVideoTimes) {
        this.managerVideoTimes = managerVideoTimes;
    }

    public BigDecimal getVipStatus() {
        return this.vipStatus;
    }
    
    public void setVipStatus(BigDecimal vipStatus) {
        this.vipStatus = vipStatus;
    }

    public String getManagerVideoAddress() {
        return this.managerVideoAddress;
    }
    
    public void setManagerVideoAddress(String managerVideoAddress) {
        this.managerVideoAddress = managerVideoAddress;
    }

    public String getManagerVideoImg() {
        return this.managerVideoImg;
    }
    
    public void setManagerVideoImg(String managerVideoImg) {
        this.managerVideoImg = managerVideoImg;
    }
   








}