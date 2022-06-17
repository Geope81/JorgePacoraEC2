package com.idat.EC2JorgePacoraVentas.seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailService service;
	
	@Autowired
	private TokenFilter filter;
	
	@Autowired
	private EntryPoint entrypoint;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(service).passwordEncoder(encriptado());
		//auth.inMemoryAuthentication().withUser("vendedor").password(encriptado().encode("123456")).roles("ADMIN");
		//auth.inMemoryAuthentication().withUser("cliente").password(encriptado().encode("123")).roles("USER");
	}

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
			
		http.authorizeRequests()
		.antMatchers("/producto/v1/listar").access("hasRole('USER')")
	    .antMatchers("/crearToken").permitAll()
        .anyRequest()
	    .authenticated()
	    .and()
	    .exceptionHandling()
	    .authenticationEntryPoint(entrypoint)
	    .and()
	    .sessionManagement()
	    .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	    .and()
	    .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class)
	    .csrf().disable();
	}
	
	@Bean
	public PasswordEncoder encriptado() {
		return new BCryptPasswordEncoder();
	}	
}
