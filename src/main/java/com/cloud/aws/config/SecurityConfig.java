package com.cloud.aws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig  {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
                .requestMatchers("/index").permitAll() // Allow access to the login page
                .anyRequest().authenticated() // Secure all other endpoints
            .and()
            .formLogin()
                .loginPage("/index") // Optional if you want a custom login page
                .permitAll(); // Allow everyone to see the login page
    }

    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
                .requestMatchers("/", "/index").permitAll() // Allow access to home and login
                .anyRequest().authenticated() // Secure all other requests
                .and()
            .formLogin()
                .loginPage("/index") // Specify your login page URL
                .defaultSuccessUrl("/", true) // Redirect to home after successful login
                .permitAll()
                .and()
            .logout()
                .permitAll();

        return http.build();
    }
}
