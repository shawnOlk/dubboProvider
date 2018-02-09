package com.dubboprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan//组件扫描
//@Configuration//配置控制
//@EnableAutoConfiguration//启用自动配置
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		DemoApplication application=new DemoApplication();
	}
}
