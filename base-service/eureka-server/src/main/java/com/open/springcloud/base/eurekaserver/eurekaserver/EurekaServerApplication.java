package com.open.springcloud.base.eurekaserver.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
//@EnableEurekaClient: 该注解表明应用既作为eureka实例又为eureka client 可以发现注册的服务
//@EnableEurekaServer: 该注解表明应用为eureka服务，有可以联合多个服务作为集群，对外提供服务注册以及发现功能
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
