package com.example.demo_github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class DemoGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGithubApplication.class, args);
	}

}

@Controller
class HelloWorldController {
    // Page d'accueil = belle liste de produits
    @GetMapping("/")
    public String showProductList(Model model) {

        // Liste statique de produits (tu peux en ajouter/supprimer facilement)
        List<Product> products = Arrays.asList(
                new Product(1L, "iPhone 16 Pro", "Le dernier smartphone Apple avec puce A18 Pro", 1299.99, "https://picsum.photos/id/1015/400/300"),
                new Product(2L, "MacBook Air M3", "Ultraléger et ultra-puissant", 1499.99, "https://picsum.photos/id/201/400/300"),
                new Product(3L, "Sony WH-1000XM5", "Casque à réduction de bruit premium", 399.99, "https://picsum.photos/id/301/400/300"),
                new Product(4L, "Samsung Galaxy Watch 7", "Montre connectée haut de gamme", 349.99, "https://picsum.photos/id/401/400/300"),
                new Product(5L, "Dyson V15 Detect", "Aspirateur sans fil intelligent", 699.99, "https://picsum.photos/id/501/400/300")
        );

        model.addAttribute("products", products);
        model.addAttribute("title", "Notre Boutique High-Tech");

        return "products";
    }
}
