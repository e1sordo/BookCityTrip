package com.vlavik.bct.city.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {

    private String name;
    private String description;
    private PriceRange prices;
}
