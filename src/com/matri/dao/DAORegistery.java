package com.matri.dao;

import com.matri.dao.impl.UserDAOImpl;

public class DAORegistery {

	public static UserDAO userDAO;

	public static UserDAO getUserDAO() {
		if (userDAO == null) {
			userDAO = new UserDAOImpl();
		}
		return userDAO;
	}

	public static void setUserDAO(UserDAO userDAO) {
		DAORegistery.userDAO = userDAO;
	}

}
