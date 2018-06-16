package com.hnu.scw.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.hnu.scw.mapper")  //配置mybatis的扫描mapper包
@SpringBootApplication(scanBasePackages = "com.hnu.scw")
@EnableTransactionManagement  //开启事务管理
public class SpringbootmybatisbyxmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmybatisbyxmlApplication.class, args);
	}
}
