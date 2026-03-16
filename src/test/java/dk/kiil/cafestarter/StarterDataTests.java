package dk.kiil.cafestarter;

import dk.kiil.cafestarter.service.MenuItemService;
import dk.kiil.cafestarter.service.OrderService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.groups.Tuple.tuple;

class StarterDataTests {

    @Test
    void menuItemsMatchTheTutorialStarterData() {
        MenuItemService menuItemService = new MenuItemService();

        assertThat(menuItemService.findAll())
                .extracting(menuItem -> menuItem.getId(),
                        menuItem -> menuItem.getName(),
                        menuItem -> menuItem.getCategory(),
                        menuItem -> menuItem.getPrice())
                .containsExactly(
                        tuple(1L, "Latte", "Drikkevarer", BigDecimal.valueOf(45.0)),
                        tuple(2L, "Croissant", "Bagværk", BigDecimal.valueOf(28.0)),
                        tuple(3L, "Espresso", "Drikkevarer", BigDecimal.valueOf(32.0)),
                        tuple(4L, "Te", "Drikkevarer", BigDecimal.valueOf(30.0))
                );
    }

    @Test
    void ordersMatchTheTutorialStarterData() {
        OrderService orderService = new OrderService();

        assertThat(orderService.findAll())
                .extracting(order -> order.getId(),
                        order -> order.getCustomerName(),
                        order -> order.getMenuItemId(),
                        order -> order.getMenuItemName(),
                        order -> order.getStatus())
                .containsExactly(
                        tuple(1L, "Maja", 1L, "Latte", "NEW"),
                        tuple(2L, "Ali", 2L, "Croissant", "READY")
                );
    }
}
