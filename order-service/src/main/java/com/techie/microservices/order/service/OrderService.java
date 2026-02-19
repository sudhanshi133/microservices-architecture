package com.techie.microservices.order.service;

import com.techie.microservices.order.model.Order;
import com.techie.microservices.order.repository.OrderRepository;
import com.techie.microservices.order.dto.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest){
     //todo map order request and then save
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setQuantity(orderRequest.quantity());
        order.setSkuCode(orderRequest.skuCode());

        orderRepository.save(order);
    }
}
