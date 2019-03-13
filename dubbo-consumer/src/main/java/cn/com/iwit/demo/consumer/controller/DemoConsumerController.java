package cn.com.iwit.demo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import cn.com.iwit.demo.api.service.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消费者控制层
 *
 * @author chenqingyong
 * @date 2019-03-13 11:46
 */
@RestController
public class DemoConsumerController {

	@Reference(version = "${dubbo.service.version}"/*, url = "dubbo://127.0.0.1:20880"*/)
	private DemoService demoService;

	@RequestMapping("/sayHello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return demoService.sayHello(name);
	}

}
