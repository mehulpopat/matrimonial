package com.matri.dao.impl;

import java.util.Map;

import org.hibernate.Session;

import com.matri.dao.MasterDAO;

public class MasterDAOImpl implements MasterDAO {

	@Override
	public Object getSingleRow(String query, Map params){
		Session session = HibernateConnection.doHibernateConnection().openSession();
		try{
			Object obj = session.createQuery(query).
					setProperties(params).list().get(0);
			return obj;
		}catch(Exception e){
			return null;
		}finally{
			if(session != null){
				session.close();
			}
		}
	}

}
