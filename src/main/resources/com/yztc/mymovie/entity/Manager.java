// default package

import java.math.BigDecimal;


/**
 * Manager entity. @author MyEclipse Persistence Tools
 */

public class Manager  implements java.io.Serializable {


    // Fields    

     private BigDecimal managerId;
     private String managerPassword;
     private String managerName;


    // Constructors

    /** default constructor */
    public Manager() {
    }

    
    /** full constructor */
    public Manager(String managerPassword, String managerName) {
        this.managerPassword = managerPassword;
        this.managerName = managerName;
    }

   
    // Property accessors

    public BigDecimal getManagerId() {
        return this.managerId;
    }
    
    public void setManagerId(BigDecimal managerId) {
        this.managerId = managerId;
    }

    public String getManagerPassword() {
        return this.managerPassword;
    }
    
    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    public String getManagerName() {
        return this.managerName;
    }
    
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
   








}