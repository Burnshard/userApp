package org.demo.app.DAO;

import java.util.ArrayList;
import java.util.List;

import org.demo.app.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryUserRepo implements UserRepository {

	private final List<User> users = new ArrayList<>();

	public InMemoryUserRepo() {
		this.users.add(new User(1l, "Michael", "Bluth", "michael.bluth@bluthcompany.com"));
		this.users.add(new User(2l, "Gob", "Bluth", "gob.bluth@bluthcompany.com"));
		this.users.add(new User(3l, "Tobias", "Funke", "tobias.funke@bluthcompany.com"));
	}
	
	
	@Override
	public List<User> findAll() {
		return users;
	}

	@Override
	public User findById(Long id) {
		User user = users.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(new User());
		return user;
	}
}
