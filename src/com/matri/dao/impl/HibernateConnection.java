package com.matri.dao.impl;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.matri.entities.User;

public class HibernateConnection {
	
	public static SessionFactory sessionFactory;
	
	public static SessionFactory doHibernateConnection(){
		if(sessionFactory != null){
			return sessionFactory;
		}
		Properties database = new Properties();
		database.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		database.setProperty("hibernate.connection.username", "root");
		database.setProperty("hibernate.connection.password", "");
		database.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/matrimonial");
		database.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		database.setProperty("hibernate.show_sql", "true");
		
		Configuration cfg = new Configuration()
							.setProperties(database)
							.addPackage("com.matri.entities")
							.addAnnotatedClass(User.class);
		
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		
		sessionFactory = cfg.buildSessionFactory(ssrb.build());
		
		return sessionFactory;
		
	}

}
