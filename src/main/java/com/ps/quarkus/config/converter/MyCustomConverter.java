package com.ps.quarkus.config.converter;

import javax.annotation.Priority;

import org.eclipse.microprofile.config.spi.Converter;

import com.ps.quarkus.config.MicroProfileCustomValue;

@Priority(150)
public class MyCustomConverter implements Converter<MicroProfileCustomValue> {

    @Override
    public MicroProfileCustomValue convert(String value) {

        final int secretNumber;
        if (value.startsWith("OBF:")) {
            secretNumber = Integer.valueOf(SecretDecoder.decode(value));
        } else {
            secretNumber = Integer.valueOf(value);
        }

        return new MicroProfileCustomValue(secretNumber);
    }
    static class SecretDecoder{

		public static String decode(String value) {
			// some logic
			return null;
		}
    	
    }
}