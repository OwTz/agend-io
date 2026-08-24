package com.agendio.api.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SpringSecurity {


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http    .cors(Customizer.withDefaults())
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(
                                "/usuarios",
                                "/usuarios/**"
                        ).permitAll()
                        .requestMatchers(
                                "/h2-console","/h2-console/**"
                        ).permitAll()
                        .requestMatchers(
                                "/usuarios","/usuarios/**"
                        ).permitAll()
                        .requestMatchers("/swagger-ui/index.html","/swagger-ui/**" ).permitAll()
                        .anyRequest().permitAll()
                )
                .headers(headers -> headers
                        .frameOptions(frame ->
                                frame.sameOrigin()
                        )
                )
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }


}
