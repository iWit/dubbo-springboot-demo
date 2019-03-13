package cn.com.iwit.demo.provider.service.impl;

import cn.com.iwit.demo.api.service.DemoService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * 服务实现和提供者类
 *
 * @author chenqingyong
 * @date 2019-03-13 11:50
 */
@Component
@Service(interfaceClass = DemoService.class, version = "${dubbo.service.version}")
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Hello, " + name + " (from Spring Boot)";
	}
}
