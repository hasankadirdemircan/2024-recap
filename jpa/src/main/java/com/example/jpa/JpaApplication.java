package com.example.jpa;

import com.example.jpa.model.Order;
import com.example.jpa.model.User;
import com.example.jpa.repository.OrderRepository;
import com.example.jpa.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Order> orderList = orderRepository.findOrderListByUserId(7L);
		orderList.forEach(System.out::println);
		orderRepository.findOrderListByUserIdNative(7L);
		List<User> userList = userRepository.findUserListByProductId(3L);
		userList.forEach(System.out::println);
	}

	private void userSave() {
		User user = new User();
		user.setCountry("TR");
		user.setEmail("test@gmail.com");
		user.setUsername("test1");

		User user2 = new User();
		user2.setCountry("TR");
		user2.setEmail("test2@gmail.com");
		user2.setUsername("test2");

		User user3 = new User();
		user3.setCountry("TR");
		user3.setEmail("test3@gmail.com");
		user3.setUsername("test3");

		userRepository.save(user);
		userRepository.save(user2);
		userRepository.save(user3);
	}

	private void orderSave() {
		Order order = new Order();
		order.setPrice(3D);
		order.setProductId(1L);
		order.setUserId(7L);

		Order order2 = new Order();
		order2.setPrice(3D);
		order2.setProductId(2L);
		order2.setUserId(7L);


		Order order3 = new Order();
		order3.setPrice(3D);
		order3.setProductId(3L);
		order3.setUserId(7L);

		Order order4 = new Order();
		order4.setPrice(3D);
		order4.setProductId(3L);
		order4.setUserId(8L);

		Order order5 = new Order();
		order5.setPrice(3D);
		order5.setProductId(2L);
		order5.setUserId(9L);

		orderRepository.save(order);
		orderRepository.save(order2);
		orderRepository.save(order3);
		orderRepository.save(order4);
		orderRepository.save(order5);
	}
}
