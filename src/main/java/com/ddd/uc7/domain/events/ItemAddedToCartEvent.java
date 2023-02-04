package com.ddd.uc7.domain.events;

import com.ddd.uc7.domain.Price;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class ItemAddedToCartEvent implements DomainEvent {
    private String productName;
    private int quantity;
    private Price price;

    public ItemAddedToCartEvent(String productName, int quantity, Price price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public Price getPrice() {
        return price;
    }
}
