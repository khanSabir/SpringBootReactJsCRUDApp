package com.ekart.orderapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ekart.orderapi.service.OrderService;
import com.ekart.orderapi.service.UserService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/public")
public class PublicController {
	
	private final UserService userService;
    private final OrderService orderService;

    @GetMapping("/numberOfUsers")
    public Integer getNumberOfUsers() {
        return userService.getUsers().size();
    }

    @GetMapping("/numberOfOrders")
    public Integer getNumberOfOrders() {
        return orderService.getOrders().size();
    }

}
