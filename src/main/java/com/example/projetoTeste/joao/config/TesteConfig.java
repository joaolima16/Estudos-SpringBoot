package com.example.projetoTeste.joao.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.projetoTeste.joao.Repositories.CategoryRepository;
import com.example.projetoTeste.joao.Repositories.OrderRepository;
import com.example.projetoTeste.joao.Repositories.ProductRepository;
import com.example.projetoTeste.joao.Repositories.UserRepository;
import com.example.projetoTeste.joao.entities.Category;
import com.example.projetoTeste.joao.entities.Order;
import com.example.projetoTeste.joao.entities.Product;
import com.example.projetoTeste.joao.entities.User;
import com.example.projetoTeste.joao.entities.enums.OrderStatus;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
    @Autowired
    private UserRepository _userRepository;

    @Autowired
    private OrderRepository _OrderRepository;

    @Autowired
    private CategoryRepository _CategoryRepository;

    @Autowired
    private ProductRepository _ProductRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.CANCELED, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.CANCELED, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.CANCELED, u1);

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        _userRepository.saveAll(Arrays.asList(u1, u2));
        _OrderRepository.saveAll(Arrays.asList(o1, o2, o3));
        _CategoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        _ProductRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
    }

}
