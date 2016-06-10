package com.dualwisdom.om.service;

import com.dualwisdom.om.pojo.OrderMain;

public interface OrderService {
	public OrderMain getOrderMainByKey(String orderKey);
}
