package dk.kiil.cafestarter.dto;

import java.math.BigDecimal;

public record MenuItemResponse(
        Long id,
        String name,
        String category,
        BigDecimal price
) {
}
