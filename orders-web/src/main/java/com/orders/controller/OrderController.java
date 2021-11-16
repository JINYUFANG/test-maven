package com.orders.controller;


import com.orders.service.OrderService;
import com.orders.service.dto.OrdersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping(value = "/id")
    public OrdersDto getOrderById(@RequestParam(value = "id")String id) {
        return this.orderService.getOrderById(id);
    }
}