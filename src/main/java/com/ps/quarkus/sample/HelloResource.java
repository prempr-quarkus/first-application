package com.ps.quarkus.sample;

import java.util.Optional;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import com.ps.quarkus.config.MicroProfileCustomValue;
import com.ps.quarkus.config.MyConfiguration;

import io.quarkus.arc.config.ConfigPrefix;

@Path("/hello")
public class HelloResource {
	
	@Inject
	MyConfiguration myConfiguration;
	
	@ConfigPrefix("other") 
	MyConfiguration otherConfiguration;
	
	@ConfigProperty(name = "greeting.message")
	String message;

	@ConfigProperty(name = "greeting.suffix", defaultValue = "!")
	String suffix;

	@ConfigProperty(name = "greeting.name")
	Optional<String> name;

	@ConfigProperty(name = "configuration.value.name")
	MicroProfileCustomValue value;
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		System.out.println(message + " " + name.orElse("world") + suffix);
		return myConfiguration.getMessage() + " " + myConfiguration.getName().orElse("world") + myConfiguration.getSuffix();
	}
}