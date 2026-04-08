package com.baitap01_session03_kha1.controller;

import com.baitap01_session03_kha1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bai1/orders")
public class OrderController {

    private final OrderService orderService;

    // Constructor Injection
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Lấy tất cả đơn hàng
    @GetMapping
    public String getAllOrders() {
        return orderService.getAllOrders();
    }

    // Lấy đơn hàng theo ID
    @GetMapping("/{id}")
    public String getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    // Thêm đơn hàng (bonus cho đủ đề)
    @PostMapping
    public String createOrder() {
        return "Tao don hang thanh cong";
    }
}