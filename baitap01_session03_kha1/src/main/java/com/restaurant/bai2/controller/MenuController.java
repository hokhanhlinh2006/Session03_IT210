
package com.restaurant.bai2.controller;

import com.baitap01_session03_kha1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bai2")
public class MenuController {

    private final OrderService orderService;

    @Autowired
    public MenuController( OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/bai2/menu")
    public String getMenu(
            @RequestParam(value = "category", required = false, defaultValue = "chay") String category
    ) {
        return "Thực đơn loại  : "+ category;
    }
}