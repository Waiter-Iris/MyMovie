package com.yztc.mymovie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yztc.mymovie.dao.ManagerDao;
import com.yztc.mymovie.entity.Manager;


@Service("managerService")
public class ManagerService {
	
	@Autowired
	private ManagerDao managerDao;
	
	//����Ա����ɾ�Ĳ����
	public List<Manager> findAll(){
		return managerDao.findAll();
	}
	public void save(Manager manager){
		managerDao.save(manager);
	}
	public void delete(Manager manager){
		managerDao.delete(manager);
	}
	public void update(Manager manager){
		managerDao.update(manager);
	}
	
	//���ҹ���Ա�����û���������-��¼�ã�
	public Manager find(Manager manager){
		return managerDao.find(manager);
	}
}
