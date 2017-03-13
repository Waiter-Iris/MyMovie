// default package

import java.math.BigDecimal;


/**
 * Vtype entity. @author MyEclipse Persistence Tools
 */

public class Vtype  implements java.io.Serializable {


    // Fields    

     private BigDecimal vtypeId;
     private String vtypeName;
     private BigDecimal areaId;


    // Constructors

    /** default constructor */
    public Vtype() {
    }

    
    /** full constructor */
    public Vtype(String vtypeName, BigDecimal areaId) {
        this.vtypeName = vtypeName;
        this.areaId = areaId;
    }

   
    // Property accessors

    public BigDecimal getVtypeId() {
        return this.vtypeId;
    }
    
    public void setVtypeId(BigDecimal vtypeId) {
        this.vtypeId = vtypeId;
    }

    public String getVtypeName() {
        return this.vtypeName;
    }
    
    public void setVtypeName(String vtypeName) {
        this.vtypeName = vtypeName;
    }

    public BigDecimal getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(BigDecimal areaId) {
        this.areaId = areaId;
    }
   








}