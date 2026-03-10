package RestfulCURD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import RestfulCURD.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}