package com.jtcindia;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JTCAppConfig {

	@Bean(name="myhaiDAO")
	public HaiDAO getHaiDAO() {
		return new HaiDAO();
	}
@Bean(name="myhaiService")

public HaiService getHaiService() {
	return new HaiService();
}
		
	}

