package com.yztc.mymovie.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yztc.mymovie.entity.Remark;

@Component("remarkDao")
public class RemarkDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Remark remark){
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		
		try {
			session.save(remark);
			System.out.println("¡Ù—‘≥…π¶");
			tr.commit();
		} catch (Exception e) {
			tr.rollback();
			
		}
			session.close();
		
	}
	
	
}
