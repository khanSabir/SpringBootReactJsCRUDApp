package com.ekart.orderapi.mapper;

import com.ekart.orderapi.controller.dto.CreateOrderRequest;
import com.ekart.orderapi.controller.dto.OrderDto;
import com.ekart.orderapi.model.Order;

public interface OrderMapper {
	
	 Order toOrder(CreateOrderRequest createOrderRequest);

	 OrderDto toOrderDto(Order order);

}
