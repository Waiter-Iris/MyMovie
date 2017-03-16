package com.yztc.mymovie.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.yztc.mymovie.entity.Users;
import com.yztc.mymovie.service.UserService;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport{
	
	@Autowired
	private UserService userService;
	
	private Users users;
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String save(){
		userService.save(users);
		return SUCCESS;
	}
	
	public String findByNameAndPassword(){
		Users user=null;
		user=userService.findByNameAndPassword(users);
		if(user!=null){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	public String change(){
		userService.change(users);
		return SUCCESS;
	}
}
