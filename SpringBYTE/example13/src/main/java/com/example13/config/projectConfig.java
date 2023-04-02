package com.example13.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.example13.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.example13.implementation","com.example13.services"})
@ComponentScan(basePackageClasses = {com.example13.beans.Vehicle.class,com.example13.beans.Person.class})		
public class projectConfig {

}
