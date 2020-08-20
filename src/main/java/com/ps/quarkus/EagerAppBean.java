package com.ps.quarkus;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.runtime.Startup;

@Startup 
@ApplicationScoped
public class EagerAppBean {

   private final String name;

   EagerAppBean(NameGenerator generator) { 
     this.name = generator.createName();
   }
}