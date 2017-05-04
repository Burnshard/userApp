package org.demo.app.service;

import java.util.List;

import org.demo.app.model.User;

/**
 * Basic interface for the User Model
 * Controls searching for the user model
 * @author Seamus
 *
 */
public interface UserService {

	public List<User> loadAllUsers();
	public User findById(Long id);
	
}
