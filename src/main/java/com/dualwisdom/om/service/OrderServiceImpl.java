package com.dualwisdom.om.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dualwisdom.om.dao.OrderMainMapper;
import com.dualwisdom.om.pojo.OrderMain;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Resource
	private OrderMainMapper orderMaindao;
	
	@Override
	public OrderMain getOrderMainByKey(String orderKey) {
		
		return orderMaindao.selectByPrimaryKey(orderKey);
	}

}
