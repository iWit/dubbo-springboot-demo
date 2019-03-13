package cn.com.iwit.demo.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 服务提供者端主程序入口类
 *
 * @author chenqingyong
 * @date 2019-03-13 11:51
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args);
	}
}
