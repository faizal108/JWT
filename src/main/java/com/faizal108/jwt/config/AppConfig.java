package com.faizal108.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails adminUser = User.builder()
                .username("Faizal")
                .password(passwordEncoder().encode("admin"))
                .roles("ADMIN")
                .build();

        UserDetails adminUser2 = User.builder()
                .username("John")
                .password(passwordEncoder().encode("admin2"))
                .roles("ADMIN")
                .build();

        UserDetails devUser = User.builder()
                .username("Muskan")
                .password(passwordEncoder().encode("dev"))
                .roles("DEV")
                .build();

        return new InMemoryUserDetailsManager(adminUser,adminUser2,devUser);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
