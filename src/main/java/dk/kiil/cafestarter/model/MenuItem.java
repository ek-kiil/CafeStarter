package dk.kiil.cafestarter.model;

import java.math.BigDecimal;

public class MenuItem {

    private final Long id;
    private final String name;
    private final String category;
    private final BigDecimal price;

    public MenuItem(Long id, String name, String category, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
