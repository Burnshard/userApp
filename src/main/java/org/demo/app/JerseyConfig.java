package org.demo.app;

import org.demo.app.web.UserController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {
		register(UserController.class);
	}
	
}
