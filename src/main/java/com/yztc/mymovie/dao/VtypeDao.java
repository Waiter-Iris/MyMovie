package com.yztc.mymovie.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yztc.mymovie.entity.Users;
import com.yztc.mymovie.entity.Vtype;

@Component("vtypeDao")
public class VtypeDao {
	@Autowired
	private SessionFactory sessionFactory;

	public List<Vtype> findAll() {
		Session session = sessionFactory.openSession();
		String sql = "from Vtype";
		Query query = session.createQuery(sql);

		@SuppressWarnings("unchecked")
		List<Vtype> vtypes = query.list();

		session.close();
		return vtypes;
	}

	public Vtype findByComedy(Vtype vtype) {
		Session session = sessionFactory.openSession();
		String hql = "from Vtype where vtypeName='"+ vtype.getVtypeName()+"'";
		Query query = session.createQuery(hql);
		
//		query.setParameter(0, vtype.getVtypeName());
//		" + vtype.getVtypeName()+"'
		// query.setParameter(0,user.getUserName());
		// query.setParameter(1,user.getUserPassword());

		// @SuppressWarnings("unchecked")
		Object obj = query.uniqueResult();
		if (obj != null) {
			@SuppressWarnings("unchecked")
			Vtype vtypes = (Vtype) obj;
			System.out.println(vtypes);
			return vtypes;
		} else
			return null;
	}

}
