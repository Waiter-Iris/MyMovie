package com.yztc.mymovie.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.yztc.mymovie.entity.Area;
import com.yztc.mymovie.service.AreaService;
import com.yztc.mymovie.service.UserService;
@Controller
@Scope("prototype")
public class AreaAction extends ActionSupport {

	@Autowired
	private AreaService areaService;
	private Area area;

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	public String findByArea(){
		areaService.findByArea(area);
		return SUCCESS;
	}

}
