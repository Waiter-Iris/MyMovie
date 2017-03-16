package com.yztc.mymovie.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


/**
 * Vtype entity. @author MyEclipse Persistence Tools
 */

public class Vtype  implements java.io.Serializable {


    // Fields    

     private BigDecimal vtypeId;
     private Area area;
     private String vtypeName;
     private Set videos = new HashSet(0);
     private Set managerVideos = new HashSet(0);


    // Constructors

    /** default constructor */
    public Vtype() {
    }

    
    /** full constructor */
    public Vtype(Area area, String vtypeName, Set videos, Set managerVideos) {
        this.area = area;
        this.vtypeName = vtypeName;
        this.videos = videos;
        this.managerVideos = managerVideos;
    }

   
    // Property accessors

    public BigDecimal getVtypeId() {
        return this.vtypeId;
    }
    
    public void setVtypeId(BigDecimal vtypeId) {
        this.vtypeId = vtypeId;
    }

    public Area getArea() {
        return this.area;
    }
    
    public void setArea(Area area) {
        this.area = area;
    }

    public String getVtypeName() {
        return this.vtypeName;
    }
    
    public void setVtypeName(String vtypeName) {
        this.vtypeName = vtypeName;
    }

    public Set getVideos() {
        return this.videos;
    }
    
    public void setVideos(Set videos) {
        this.videos = videos;
    }

    public Set getManagerVideos() {
        return this.managerVideos;
    }
    
    public void setManagerVideos(Set managerVideos) {
        this.managerVideos = managerVideos;
    }
   








}