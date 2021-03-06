package com.example.menu.item;
import org.springframework.data.annotation.Id;

import org.hibernate.validator.constraints.URL;


import javax.validation.constraints.*;

public class Item {
    private final Long id;

    @NotNull(message = "name is required")
    @Pattern(regexp="^[a-zA-Z ]+$", message = "name must be a string")
    private final String name;

    @NotNull(message = "price is required")
    @Positive(message = "price must be positive")
    private final Long price;

    @NotNull(message = "description is required")
    @Pattern(regexp="^[a-zA-Z ]+$", message = "description must be a string")
    private final String description;

    public Item(
            Long id,
            String name,
            Long price,
            String description

    ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;

    }



    public String getName() {
        return name;
    }

    public Long getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Id
    public Long getId() {
        return id;
    }


    public Item updateWith(Item item) {
        return new Item(
                this.id,
                item.name,
                item.price,
                item.description
        );
    }
}
