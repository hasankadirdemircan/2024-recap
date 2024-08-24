package com.example.jpa.repository;

import com.example.jpa.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    //productId 'si belli olanı hangi user'lar aldı
    @Query("SELECT u FROM User u INNER JOIN Order o ON u.id = o.userId AND o.productId = :productId")
    List<User> findUserListByProductId(@Param("productId") Long productId);

    //TODO: ben User tablosundan username ve email, Order tablosundan da price bilgisini dönsün istiyorum. Bunu nasıl yapabilirim? (Dto)
}
