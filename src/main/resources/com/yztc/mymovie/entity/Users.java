// default package

import java.math.BigDecimal;
import java.util.Date;


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


    // Constructors

    /** default constructor */
    public Users() {
    }

    
    /** full constructor */
    public Users(String userName, String userPassword, String userEmail, String userPhone, BigDecimal userVip, Date vipStart, Date vipEnd, String userImg) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userVip = userVip;
        this.vipStart = vipStart;
        this.vipEnd = vipEnd;
        this.userImg = userImg;
    }

   
    // Property accessors

    public BigDecimal getUserId() {
        return this.userId;
    }
    
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
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
   








}