package com.yztc.mymovie.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yztc.mymovie.entity.History;



@Component("histroyDao")
public class HistoryDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<History> findAll(){		
		Session session = sessionFactory.openSession();
		String hql = "select historyDate,historyPlaytime,videoName,videoImgfrom Manager,Voideo";
		Query query = session.createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<History> historys = query.list();
		
		session.close();
		return historys;
	}
	
	
	public void save(History history){	
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		
		try {
			session.save(history);
			System.out.println("保存历史记录成功");
			tr.commit();
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}	
		session.close();
	}
	
	
	public void delete(History history){
		Session session  = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		
		try {
			session.delete(history);
			System.out.println("删除历史记录成功");
			tr.commit();
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		session.close();
	}
	
	

}
