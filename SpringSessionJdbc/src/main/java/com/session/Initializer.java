package com.session;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;


import com.session.config.SessionJdbcConfig;


public class Initializer extends AbstractHttpSessionApplicationInitializer {
	
	public Initializer() {
		super(SessionJdbcConfig.class); 
	}


}
