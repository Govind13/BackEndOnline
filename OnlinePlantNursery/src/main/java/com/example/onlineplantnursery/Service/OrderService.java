package com.example.onlineplantnursery.Service;

import java.util.List;
import com.example.onlineplantnursery.Entity.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    Order addOrder(Order order);
    Order updateOrder(Integer bookingOrderId,Order order);
    void deleteOrder(Integer bookingOrderId);
    Order viewOrder(Integer bookingOrderId);
    List<Order> viewAllOrders();

}