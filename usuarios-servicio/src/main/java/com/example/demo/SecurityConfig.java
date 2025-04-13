package com.example.demo;

import java.lang.annotation.Annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig implements WebSecurityConfigurerAdapter {

    @Override
	public void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .requestMatchers("/public/**").permitAll() // Permitir acceso a rutas públicas
                .anyRequest().authenticated()          // Requiere autenticación en otras rutas
            .and()
            .formLogin()
                .loginPage("/login")                   // Página personalizada de inicio de sesión
                .permitAll()
            .and()
            .logout()
                .permitAll();                          // Permitir cerrar sesión
    }

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}
}
