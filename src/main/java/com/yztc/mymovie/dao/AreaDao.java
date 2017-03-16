package com.yztc.mymovie.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yztc.mymovie.entity.Area;
import com.yztc.mymovie.entity.Vtype;

@Component("areaDao")
public class AreaDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Area findByArea(Area area){
		
		Session session=sessionFactory.openSession();
		String sql="from Area where areaName='"+area.getAreaName()+"'";
		Query query=session.createQuery(sql);
		
		Object obj = query.uniqueResult();
		if (obj != null) {
			@SuppressWarnings("unchecked")
			Area areas = (Area) obj;
			System.out.println(areas);
			return areas;
		} else
			return null;
	}
		
}
