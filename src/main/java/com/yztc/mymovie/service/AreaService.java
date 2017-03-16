package com.yztc.mymovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yztc.mymovie.dao.AreaDao;
import com.yztc.mymovie.entity.Area;

@Service("areaService")
public class AreaService {

	@Autowired
	private AreaDao areaDao;
	
	public Area findByArea(Area area){
		return areaDao.findByArea(area);
	}
}
