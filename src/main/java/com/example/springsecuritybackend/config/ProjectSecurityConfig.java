package com.example.springsecuritybackend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {
    //    myAccount - Secured
//    myBalance - Secured
//    myLoans - Secured
//    myCards - Secured
//    notices - not Secured
//    contact - not Secured
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
    }
}
