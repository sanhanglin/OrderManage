package com.dualwisdom.om.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dualwisdom.om.dao.OrderMainDao;
import com.dualwisdom.om.pojo.OrderMain;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Resource
	private OrderMainDao orderMaindao;
	
	@Override
	public OrderMain getOrderMainByKey(String orderKey) {
		
		return orderMaindao.get(orderKey);
	}

}
