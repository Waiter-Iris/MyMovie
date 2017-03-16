package com.yztc.mymovie.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User;
import com.yztc.mymovie.entity.History;
import com.yztc.mymovie.entity.Video;
import com.yztc.mymovie.service.HistoryService;



@Controller
@Scope("prototype")
public class HistoryAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7032310672674422917L;
	
	
	@Autowired
	private HistoryService historyService;
	private History history;
	private List<History> histories;
	public History getHistory() {
		return history;
	}
	public void setHistory(History history) {
		this.history = history;
	}
	public List<History> getHistories() {
		return histories;
	}
	public void setHistories(List<History> histories) {
		this.histories = histories;
	}
	
	public String findAll(){
	   historyService.findAll();
		return SUCCESS;
	}
	/*public String save(){
		historyService.save(history);
		return SUCCESS;
		User user=new User();
		Video video=new Video();
		History history=new History();
		
		
	}*/
	public String delete(){
		historyService.delete(history);
		return SUCCESS;
	}

	
	
	
}
