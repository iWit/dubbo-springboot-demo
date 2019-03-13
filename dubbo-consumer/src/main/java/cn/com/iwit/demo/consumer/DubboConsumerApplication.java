package cn.com.iwit.demo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 消费者主程序入口类
 *
 * @author chenqingyong
 * @date 2019-03-13 11:46
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerApplication.class, args);
	}
}
