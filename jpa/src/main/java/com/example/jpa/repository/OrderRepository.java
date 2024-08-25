package com.example.jpa.repository;

import com.example.jpa.model.Order;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("Select o from Order o where o.userId = :userId")
    List<Order> findOrderListByUserId(@Param("userId") Long userId);

    @Query(value = "Select * from orders o where o.user_id = :userId", nativeQuery = true)
    List<Order> findOrderListByUserIdNative(@Param("userId") Long userId);
}
