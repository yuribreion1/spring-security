package com.training.springsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    /**
     * Custom filter chain that intercept all http transactions
     * @param http
     * @throws Exception
     */

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeHttpRequests((authorizeHttpRequests) -> authorizeHttpRequests
                        .requestMatchers("myAccount","myBalance","myCards").authenticated()
                        .requestMatchers("contact","notices","register").permitAll())
                .httpBasic((httpBasic) -> httpBasic.init(http))
                .formLogin((formLogin) -> {
                    try {
                        formLogin.init(http);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });

        return http.build();
    }
}
