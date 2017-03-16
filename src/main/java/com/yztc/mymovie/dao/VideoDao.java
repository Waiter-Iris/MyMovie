package com.yztc.mymovie.dao;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.yztc.mymovie.entity.Video;
import com.yztc.mymovie.entity.Vtype;

@Component("videoDao")
public class VideoDao extends ActionSupport {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Video video) {
		Session session = sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(video);
		tx.commit();
		session.close();
	}
}
