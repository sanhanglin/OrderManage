package com.dualwisdom.om.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dualwisdom.om.dao.OrderMainMapper;
import com.dualwisdom.om.pojo.OrderMain;
import com.dualwisdom.om.pojo.OrderMainExample;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMainMapper orderMainMapper;
	
	@Override
	public OrderMain getOrderMainByKey(String orderKey) {
		
		return orderMainMapper.selectByPrimaryKey(orderKey);
	}

	@Override
	public List<OrderMain> getAllOrderMain() {
		return orderMainMapper.selectByExample(null);
	}

	@Override
	public List<OrderMain> getOrderMainByExample(OrderMainExample example) {		
		return orderMainMapper.selectByExample(example);
	}

}
