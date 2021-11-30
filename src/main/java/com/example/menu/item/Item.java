package com.example.menu.item;
import org.springframework.data.annotation.Id;

public class Item {
    private final Long id;
    private final String name;
    private final Long price;
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
