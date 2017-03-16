package com.yztc.mymovie.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.yztc.mymovie.entity.Vtype;
import com.yztc.mymovie.service.VtypeService;

@Controller
@Scope("prototype")
public class VtypeAction extends ActionSupport {
	@Autowired
	private VtypeService vtypeService;
	private List<Vtype> vtypes;
	private Vtype vtype;
	

	public Vtype getVtype() {
		return vtype;
	}

	public void setVtype(Vtype vtype) {
		this.vtype = vtype;
	}

	public List<Vtype> getVtypes() {
		return vtypes;
	}

	public void setVtypes(List<Vtype> vtypes) {
		this.vtypes = vtypes;
	}

	public String findAll() {
		vtypes = vtypeService.findAll();
		return SUCCESS;
	}
	
	public String findByComedy() {
		Vtype vType=null;
		vType=vtypeService.findByComedy(vtype);
		if (vType!=null) {
			return SUCCESS;
		}else{
			return ERROR;
		}
		
	}

}
