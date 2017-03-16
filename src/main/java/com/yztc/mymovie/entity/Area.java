package com.yztc.mymovie.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Area entity. @author MyEclipse Persistence Tools
 */

public class Area implements java.io.Serializable {

	// Fields

	private BigDecimal areaId;
	private String areaName;
	private Set vtypes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Area() {
	}

	/** full constructor */
	public Area(String areaName, Set vtypes) {
		this.areaName = areaName;
		this.vtypes = vtypes;
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

	public Set getVtypes() {
		return this.vtypes;
	}

	public void setVtypes(Set vtypes) {
		this.vtypes = vtypes;
	}

}