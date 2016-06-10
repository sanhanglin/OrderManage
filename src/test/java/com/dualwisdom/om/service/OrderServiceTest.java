package com.dualwisdom.om.service;

import javax.annotation.Resource;

import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dualwisdom.om.pojo.OrderMain;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class OrderServiceTest {

	@Resource
	private OrderService orderService;
	
	@Test
	public void testService() {
		OrderMain order = orderService.getOrderMainByKey("");
		System.out.println("EXTERN_ORDER_KEY = " + order.getExternOrderKey());
	}
}
