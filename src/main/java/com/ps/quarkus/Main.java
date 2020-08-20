package com.ps.quarkus;

import javax.inject.Inject;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.CommandLineArguments;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain  
public class Main {
	@Inject
	@CommandLineArguments
	String[] args;
	
    public static void main(String ... args) {
        System.out.println("Running main method");
        //Quarkus.run(args); 
        
        Quarkus.run(MyApp.class, args);
    }
    
    public static class MyApp implements QuarkusApplication {

        @Override
        public int run(String... args) throws Exception {
            System.out.println("Do startup logic here");
            Quarkus.waitForExit();
            return 0;
        }
    }
}