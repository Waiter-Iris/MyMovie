package com.yztc.mymovie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yztc.mymovie.dao.HistoryDao;
import com.yztc.mymovie.entity.History;


@Service("historyService")
public class HistoryService {
	@Autowired
	private HistoryDao historyDao;
	
	public List<History> findAll(){
		return historyDao.findAll();
	}
	
	public void save(History history){
		historyDao.save(history);
	}
	
	public void delete(History history){
		historyDao.delete(history);
	}

}
