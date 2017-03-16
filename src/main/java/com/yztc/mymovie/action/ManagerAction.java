package com.yztc.mymovie.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


import com.opensymphony.xwork2.ActionSupport;
import com.yztc.mymovie.entity.Manager;
import com.yztc.mymovie.service.ManagerService;

@SuppressWarnings("serial")//版本号的注解，可忽略
@Controller
@Scope("prototype")
public class ManagerAction extends ActionSupport {
	
	@Autowired
	private ManagerService managerService;
	@Autowired
	private Manager manager;
	@Autowired
	private List<Manager> managers;
	
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public List<Manager> getManagers() {
		return managers;
	}
	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}
	
	//以下为管理员的增删改查动作
	public String findAll(){
		managers = managerService.findAll();
		return SUCCESS;
	}
	public String save(){
		managerService.save(manager);
		return SUCCESS;
	}
	public String delete(){
		managerService.delete(manager);
		return SUCCESS;
	}
	public String update(){
		managerService.update(manager);
		return SUCCESS;
	}
	public String find(){
		Manager m = null;
		m = managerService.find(manager);
		if(m!=null){
			return SUCCESS;			
		}else{
			return ERROR;
		}
	}
	
}
