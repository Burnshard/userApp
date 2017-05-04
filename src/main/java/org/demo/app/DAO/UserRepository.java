package org.demo.app.DAO;

import java.util.List;

import org.demo.app.model.User;

public interface UserRepository {
	
	public List<User> findAll();
	public User findById(Long id);

}
