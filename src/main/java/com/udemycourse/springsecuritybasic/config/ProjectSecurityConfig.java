package com.udemycourse.springsecuritybasic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.csrf((csrf) -> csrf.disable())
            .authorizeHttpRequests((requests)->requests
                        .requestMatchers("/myAccount/**","/myBalance/**","/myLoans/**","/myCards/**").authenticated()
                        .requestMatchers("/notices","/contact","/register").permitAll())
        .formLogin(Customizer.withDefaults())
        .httpBasic(Customizer.withDefaults());
        return http.build();
    }

/*    @Bean
    public UserDetailsService userDetailsService(DataSource datasource){
        return new JdbcUserDetailsManager(datasource);
    }*/

    @Bean
    //por ahora las voy a almacenar en tezto plano
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
