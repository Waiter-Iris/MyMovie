package com.yztc.mymovie.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yztc.mymovie.entity.Manager;

@Component("managerDao")
public class ManagerDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public List<Manager> findAll(){		
		Session session = sessionFactory.openSession();
		String hql = "from Manager";
		Query query = session.createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Manager> managers = query.list();
		
		session.close();
		return managers;
	}
	
	
	public void save(Manager manager){	
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		
		try {
			session.save(manager);
			System.out.println("保存管理员成功");
			tr.commit();
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}	
		session.close();
	}
	
	
	public void delete(Manager manager){
		Session session  = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		
		try {
			session.delete(manager);
			System.out.println("删除管理员成功");
			tr.commit();
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		session.close();
	}

	public void update(Manager manager){
		Session session  = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		
		try {
			session.update(manager);
			tr.commit();
		} catch (Exception e) {
			tr.rollback();
		}
		session.close();
	}
	
	//查找管理员（按用户名和密码查找-登录用）
	public Manager find(Manager manager){
		Session session = sessionFactory.openSession();	
		String hql = "from Manager where managerName=? and managerPassword=?";
		Query query = session.createQuery(hql);
		query.setParameter(0,manager.getManagerName());
		query.setParameter(1,manager.getManagerPassword());
		Object obj= query.uniqueResult();
		if(obj!=null){
			Manager m = (Manager) obj;
			return m;			 
		 }else
			 return null;
	}
	
}
