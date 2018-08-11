package com.vlavik.bct.city.model.prices;

import com.vlavik.bct.city.model.Item;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantPrices {

    private Item inexpensiveRestaurant;
    private Item midRangeRestaurant;
    private Item fastFood;
    private Item domesticBeer;
    private Item importedBeer;
    private Item cappuccino;
    private Item pepsi;
    private Item water;
}
