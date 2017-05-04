package org.demo.app.service;

import java.util.List;

import org.demo.app.DAO.UserRepository;
import org.demo.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Simple service for the user class 
 * implements the {@link}UserService interface
 * @author Seamus
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	
	/**
	 * Method will load all User Objects,
	 * use with care
	 * @author Seamus
	 */
	@Override
	public List<User> loadAllUsers() {
		return userRepository.findAll();
	}

	
	
	/**
	 * Load a User object by the given Id
	 * Returns blank object if Id is unKnown
	 * @author Seamus
	 */
	@Override
	public User findById(Long id) {
		return userRepository.findById(id);
	}
	
	


}
