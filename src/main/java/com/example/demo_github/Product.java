package com.example.demo_github;

public class Product {
    private Long id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;   // URL d'une image (on utilisera des placeholders)

    // Constructeur
    public Product(Long id, String name, String description, double price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    // Getters (obligatoires pour Thymeleaf)
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
    public String getImageUrl() { return imageUrl; }
}
