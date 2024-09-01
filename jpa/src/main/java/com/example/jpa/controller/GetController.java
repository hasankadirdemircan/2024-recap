package com.example.jpa.controller;

import com.example.jpa.dto.IUserOrderDTO;
import com.example.jpa.dto.UserOrderDTO;
import com.example.jpa.model.Order;
import com.example.jpa.model.User;
import com.example.jpa.repository.OrderRepository;
import com.example.jpa.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("get")
public class GetController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public ResponseEntity<List<Order>> getOrderListByUserId() {

        return ResponseEntity.ok(orderRepository.findOrderListByUserId(7L));
    }

    @GetMapping("/all/user")
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
