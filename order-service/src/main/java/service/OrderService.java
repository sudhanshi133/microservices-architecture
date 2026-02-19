package service;

import com.techie.microservices.order.model.Order;
import com.techie.microservices.order.repository.OrderRepository;
import dto.OrderRequest;
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
        order.setPrice(orderRequest.price());

        orderRepository.save(order);
    }
}
