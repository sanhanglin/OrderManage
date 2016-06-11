package com.dualwisdom.om.service;

import java.util.List;

import com.dualwisdom.om.pojo.OrderMain;
import com.dualwisdom.om.pojo.OrderMainExample;

public interface OrderService {
	
	public OrderMain getOrderMainByKey(String orderKey);
	public List<OrderMain> getAllOrderMain();
	public List<OrderMain> getOrderMainByExample(OrderMainExample example);	
	
	
}
