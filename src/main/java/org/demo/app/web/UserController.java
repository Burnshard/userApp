package org.demo.app.web;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.demo.app.model.User;
import org.demo.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("users")
@Produces(MediaType.APPLICATION_JSON)
public class UserController {

	@Autowired
	private UserService userService;
	
	@GET
	public Response findAll() {
		List<User> users = userService.loadAllUsers();
		
		return Response.ok(users).build();
	}

	@GET
	@Path("{id}")
	public Response findById(
			@PathParam(value = "id") Long id) {
			User user = userService.findById(id);
			
			return Response.ok(user).build();
	}
	
}
