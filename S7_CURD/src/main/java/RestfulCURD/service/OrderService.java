package RestfulCURD.service;

import java.util.List;
import RestfulCURD.model.Order;

public interface OrderService 
{
    public Order addOrder(Order order);
    public List<Order> viewAllOrders();
}