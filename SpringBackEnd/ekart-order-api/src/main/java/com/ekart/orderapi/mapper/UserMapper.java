package com.ekart.orderapi.mapper;

import com.ekart.orderapi.controller.dto.UserDto;
import com.ekart.orderapi.model.User;

public interface UserMapper {
	 UserDto toUserDto(User user);

}
