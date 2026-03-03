package com.techie.microservices.order.service;

import com.techie.microservices.order.client.InventoryClient;
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
    private final InventoryClient inventoryClient;

    public void placeOrder(OrderRequest orderRequest) {
        Boolean isInStock = inventoryClient.isInStock(orderRequest.skuCode(), orderRequest.quantity());
        if (isInStock) {
            //todo map order request and then save
            Order order = new Order();
            order.setOrderNumber(UUID.randomUUID().toString());
            order.setPrice(orderRequest.price());
            order.setQuantity(orderRequest.quantity());
            order.setSkuCode(orderRequest.skuCode());
            orderRepository.save(order);
        }
        else{
            throw new RuntimeException("the product is not in stock for now , Try again later");
        }
    }
}
