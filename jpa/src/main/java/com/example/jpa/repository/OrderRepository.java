package com.example.jpa.repository;

import com.example.jpa.model.Order;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderRepository extends JpaRepository<Order, Long> {

    //verilen userId'ye göre satın aldığı ürünleri dönsün.
    @Query("Select o from Order o where o.userId = :userId")
    List<Order> findOrderListByUserId(@Param("userId") Long userId);
}
