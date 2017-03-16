package com.yztc.mymovie.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yztc.mymovie.dao.VtypeDao;
import com.yztc.mymovie.entity.Vtype;

@Service("vtypeService")
public class VtypeService {
	@Autowired
	private VtypeDao vtypeDao;
	
	public List<Vtype> findAll(){
		return vtypeDao.findAll();
	}

	public Vtype findByComedy(Vtype vtype) {
		return vtypeDao.findByComedy(vtype);
	}

	
	
}
