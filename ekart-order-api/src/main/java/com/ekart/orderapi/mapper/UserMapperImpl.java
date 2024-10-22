package com.ekart.orderapi.mapper;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ekart.orderapi.controller.dto.UserDto;
import com.ekart.orderapi.model.Order;
import com.ekart.orderapi.model.User;

@Service
public class UserMapperImpl implements UserMapper{

	@Override
	public UserDto toUserDto(User user) {
		 if (user == null) {
	            return null;
	        }
	        List<UserDto.OrderDto> orders = user.getOrders().stream().map(this::toUserDtoOrderDto).toList();
	        return new UserDto(user.getId(), user.getUsername(), user.getName(), user.getEmail(), user.getRole(), orders);

	}
	
	   private UserDto.OrderDto toUserDtoOrderDto(Order order) {
	        if (order == null) {
	            return null;
	        }
	        return new UserDto.OrderDto(order.getId(), order.getDescription(), order.getCreatedAt());
	    }
	

}
