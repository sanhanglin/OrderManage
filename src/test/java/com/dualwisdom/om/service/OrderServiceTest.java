package com.dualwisdom.om.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dualwisdom.om.dao.OrderMainMapper;
import com.dualwisdom.om.pojo.OrderMain;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class OrderServiceTest {

	//@Autowired
	//private OrderService orderService;
	
	@Autowired
	private OrderMainMapper om;
	
	@Test
	public void testService() {
		//OrderMain order = orderService.getOrderMainByKey("02216061000000000001");
		OrderMain order = om.selectByPrimaryKey("02216061000000000001");
		System.out.println("EXTERN_ORDER_KEY = " + order.getExternOrderKey());
	}
}
