package com.matri.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.matri.dao.UserDAO;
import com.matri.entities.User;

public class UserDAOImpl extends MasterDAOImpl implements UserDAO {

	@Override
	public User getUserById(Long id) {
		String query = "From User where id = :id";
		Map params = new HashMap();
		params.put("id", id);
		return (User) getSingleRow(query, params);
	}

}
