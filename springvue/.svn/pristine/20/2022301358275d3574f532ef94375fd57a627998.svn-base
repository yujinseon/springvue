package com.web.vue.configuration;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class MybatisConfig {
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(
			SqlSessionFactory sqf) {
		return new SqlSessionTemplate(sqf);
	}
}
