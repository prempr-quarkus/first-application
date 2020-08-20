package com.ps.quarkus.config;

import org.eclipse.microprofile.config.spi.Converter;

public class MicroProfileCustomValueConverter implements Converter<MicroProfileCustomValue> {

	@Override
	public MicroProfileCustomValue convert(String value) {
		return new MicroProfileCustomValue(Integer.valueOf(value));
	}
}
