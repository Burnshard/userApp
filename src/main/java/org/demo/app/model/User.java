package org.demo.app.model;

/**
 * Simple model for a dummy user 
 * @author Seamus
 *
 */
public class User {

	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	
	public User (
			Long id,
			String firstName,
			String lastName,
			String email) {

		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
	}
	
	public User() {
		this.id=null;
		this.firstName="";
		this.lastName="";
		this.email="";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
