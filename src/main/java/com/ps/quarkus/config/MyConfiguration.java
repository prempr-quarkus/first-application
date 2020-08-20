package com.ps.quarkus.config;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.Size;

import io.quarkus.arc.config.ConfigProperties;

@ConfigProperties(prefix = "greeting")
public class MyConfiguration {
	@Size(min = 20) // This will work after validation add
	private String message;
	private String suffix = "!";
	private Optional<String> name;
	public HiddenConfig hidden;
	public static class HiddenConfig{
		public Integer prizeAmount;
        public List<String> recipients;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public Optional<String> getName() {
		return name;
	}

	public void setName(Optional<String> name) {
		this.name = name;
	}

}
