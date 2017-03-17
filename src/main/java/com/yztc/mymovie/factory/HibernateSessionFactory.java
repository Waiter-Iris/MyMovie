package com.yztc.mymovie.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Component;

//�̰߳�ȫ
@Component("sessionFactory")
public class HibernateSessionFactory {

	//������һ������
	private static Configuration configuration = new Configuration();
	private static SessionFactory sessionFactory= null;
	//�������
	private static ServiceRegistry serviceRegistry = null;
	
	public static SessionFactory getSessionFactory(){
		if(sessionFactory == null){
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			sessionFactory = new Configuration().configure().buildSessionFactory(serviceRegistry);
		}
		return sessionFactory;
	}
	
	public static void close(){
		if(!sessionFactory.isClosed()){
			sessionFactory.close();
			sessionFactory = null;
		}
	}
}
