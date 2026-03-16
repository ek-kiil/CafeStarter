package dk.kiil.cafestarter.service;

import dk.kiil.cafestarter.model.MenuItem;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class MenuItemService {

    private final List<MenuItem> menuItems;

    public MenuItemService() {
        this.menuItems = List.of(
                new MenuItem(1L, "Latte", "Drikkevarer", BigDecimal.valueOf(45.0)),
                new MenuItem(2L, "Croissant", "Bagværk", BigDecimal.valueOf(28.0)),
                new MenuItem(3L, "Espresso", "Drikkevarer", BigDecimal.valueOf(32.0)),
                new MenuItem(4L, "Te", "Drikkevarer", BigDecimal.valueOf(30.0))
        );
    }

    public List<MenuItem> findAll() {
        return menuItems;
    }
}
