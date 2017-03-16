package com.yztc.mymovie.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yztc.mymovie.entity.Users;

@Component("userDao")
public class UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Users users){
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
			try {
				session.save(users);
				tr.commit();
			} catch (Exception e) {
				tr.rollback();
			}
			session.close();
	}
	
	public Users findByNameAndPassword(Users user){
		Session session = sessionFactory.openSession();	
		String hql = "from Users where userName=? and userPassword=?";
		Query query = session.createQuery(hql);
		
		query.setParameter(0,user.getUserName());
		query.setParameter(1,user.getUserPassword());
		
		 Object obj= query.uniqueResult();
		 if(obj!=null){
			@SuppressWarnings("unchecked")
			Users users = (Users) obj;
			return users;			 
		 }else
			 return null;
	}
	
	public void change(Users users){
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
			try {
				session.update(users);
				tr.commit();
			} catch (Exception e) {
				tr.rollback();
			}
			session.close();
	}
}
