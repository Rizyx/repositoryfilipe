package br.com.repositoryfilipe;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("Rest")
public class MyApplication extends ResourceConfig {
	
	public MyApplication() {
		packages("br.com.repositoryfilipe");
	}
}
