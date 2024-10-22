package com.ekart.orderapi.service;

import java.util.List;

import com.ekart.orderapi.model.Order;

public interface OrderService {
	List<Order> getOrders();

    List<Order> getOrdersContainingText(String text);

    Order validateAndGetOrder(String id);

    Order saveOrder(Order order);

    void deleteOrder(Order order);
}
