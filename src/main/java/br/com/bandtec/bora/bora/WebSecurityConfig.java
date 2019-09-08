package br.com.bandtec.bora.bora;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
		.antMatchers(HttpMethod.GET, "/").permitAll()
		.antMatchers(HttpMethod.GET, "/api/usuarios").permitAll()
		.antMatchers(HttpMethod.POST, "/api/cadastrar-usuario").permitAll()
		.anyRequest().authenticated()
		.and().formLogin().permitAll()
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
//		http.csrf().disable()
//            .authorizeRequests()
//                .antMatchers("/", "/home", "/api**", "/api/usuarios**")
//                	.permitAll()
//            .anyRequest()
//            	.authenticated().and()
//            .formLogin()
//            	.loginPage("/login")
//                	.permitAll().and()
//            .logout()
//                .permitAll();
    }
	
	@Override
	public void configure(WebSecurity webSecurity) throws Exception {
	    webSecurity.ignoring().antMatchers(HttpMethod.POST, "/api/cadastro-usuario");
	}
	
    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
             User.withDefaultPasswordEncoder()
                .username("bruno")
                .password("123")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}