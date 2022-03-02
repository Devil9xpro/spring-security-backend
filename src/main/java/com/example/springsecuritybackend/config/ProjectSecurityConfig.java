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
//        default configuration which will secure all the request
//        http.authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .formLogin()
//                .and().
//                httpBasic();


//        custom configuration for requirement above
//        http.authorizeRequests()
//                .antMatchers("/myAccount").authenticated()
//                .antMatchers("/myBalance").authenticated()
//                .antMatchers("/myLoans").authenticated()
//                .antMatchers("/myCards").authenticated()
//                .antMatchers("/notices").permitAll()
//                .antMatchers("/contact").permitAll()
//                .and()
//                .formLogin()
//                .and()
//                .httpBasic();

//        configuration to deny all the requests
        http.authorizeRequests().anyRequest().denyAll()
                .and()
                .formLogin()
                .and()
                .httpBasic();

    }
}
