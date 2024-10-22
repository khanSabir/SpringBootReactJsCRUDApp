package com.ekart.orderapi.mapper;

import org.springframework.stereotype.Service;

import com.ekart.orderapi.controller.dto.CreateOrderRequest;
import com.ekart.orderapi.controller.dto.OrderDto;
import com.ekart.orderapi.model.Order;

@Service
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order toOrder(CreateOrderRequest createOrderRequest) {
        if (createOrderRequest == null) {
            return null;
        }
        return new Order(createOrderRequest.getDescription());
    }

    @Override
    public OrderDto toOrderDto(Order order) {
        if (order == null) {
            return null;
        }
        OrderDto.UserDto userDto = new OrderDto.UserDto(order.getUser().getUsername());
        return new OrderDto(order.getId(), order.getDescription(), userDto, order.getCreatedAt());
    }
}