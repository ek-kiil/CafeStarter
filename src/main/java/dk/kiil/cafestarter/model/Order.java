package dk.kiil.cafestarter.model;

public class Order {

    private final Long id;
    private final String customerName;
    private final Long menuItemId;
    private final String menuItemName;
    private final String status;

    public Order(Long id, String customerName, Long menuItemId, String menuItemName, String status) {
        this.id = id;
        this.customerName = customerName;
        this.menuItemId = menuItemId;
        this.menuItemName = menuItemName;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Long getMenuItemId() {
        return menuItemId;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public String getStatus() {
        return status;
    }
}
