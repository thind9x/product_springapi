package com.pmcmusic.demoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.pmcmusic.demoapi" })
public class DemoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoapiApplication.class, args);
	}

	// public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// 	@Override
	// 	protected void configure(HttpSecurity security) throws Exception {
	// 		security.httpBasic().disable();
	// 	}
	// }

}
