package com.dualwisdom.om.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dualwisdom.om.dao.OrderMainMapper;
import com.dualwisdom.om.pojo.OrderMain;
import com.dualwisdom.om.pojo.OrderMainExample;
import com.dualwisdom.om.pojo.OrderMainExample.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class OrderServiceTest {

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private OrderMainMapper om;
	
	@Test
	public void testService() {
		OrderMain order = orderService.getOrderMainByKey("02216061000000000001");
		//OrderMain order = om.selectByPrimaryKey("02216061000000000001");
		System.out.println("EXTERN_ORDER_KEY = " + order.getExternOrderKey());
	}
	
	@Test
	public void testSelectByExample() {
		String orderKey = "02216061000000000001";
		OrderMainExample example = new OrderMainExample();
		Criteria criteria = example.createCriteria();
		criteria.andOrderKeyEqualTo(orderKey);
		
		List<OrderMain> listOrderMain = om.selectByExample(example);
		for(OrderMain o : listOrderMain) {
			System.out.println("EXTERN_ORDER_KEY = " + o.getExternOrderKey());
		}
	}
	
	@Test
	public void testSelectAll() {
		List<OrderMain> listOrderMain = om.selectByExample(null);
		for(OrderMain o : listOrderMain) {
			System.out.println("EXTERN_ORDER_KEY = " + o.getExternOrderKey());
		}
	}
}
