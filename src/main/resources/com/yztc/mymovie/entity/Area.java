// default package

import java.math.BigDecimal;


/**
 * Area entity. @author MyEclipse Persistence Tools
 */

public class Area  implements java.io.Serializable {


    // Fields    

     private BigDecimal areaId;
     private String areaName;


    // Constructors

    /** default constructor */
    public Area() {
    }

    
    /** full constructor */
    public Area(String areaName) {
        this.areaName = areaName;
    }

   
    // Property accessors

    public BigDecimal getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(BigDecimal areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return this.areaName;
    }
    
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
   








}