package com.example.jpa.repository;

import com.example.jpa.dto.IUserOrderDTO;
import com.example.jpa.dto.UserOrderDTO;
import com.example.jpa.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u INNER JOIN Order o ON u.id = o.userId AND o.productId = :productId")
    List<User> findUserListByProductId(@Param("productId") Long productId);

    @Query(value = "SELECT u.* FROM users u INNER JOIN orders o ON u.id = o.user_id AND o.product_id = :productId", nativeQuery = true)
    List<User> findUserListByProductIdNative(@Param("productId") Long productId);

    @Query("SELECT new com.example.jpa.dto.UserOrderDTO(u.username, u.email, o.price) FROM User u INNER JOIN Order o ON u.id = o.userId AND o.productId = :productId")
    List<UserOrderDTO> findUserOrderListByProductId(@Param("productId") Long productId);

    @Query(value = "SELECT u.username AS username, u.email AS email, o.price AS price FROM users u INNER JOIN orders o ON u.id = o.user_id WHERE o.product_id = :productId", nativeQuery = true)
    List<IUserOrderDTO> findUserOrdersByProductIdNative(@Param("productId") Long productId);

}
