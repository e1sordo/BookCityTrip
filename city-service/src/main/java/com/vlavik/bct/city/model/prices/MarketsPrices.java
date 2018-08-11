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
public class MarketsPrices {

    private Item milk;
    private Item bread;
    private Item rice;
    private Item eggs;
    private Item cheese;
    private Item chicken;
    private Item beef;
    private Item apples;
    private Item banana;
    private Item oranges;
    private Item tomato;
    private Item potato;
    private Item onion;
    private Item lettuce;
    private Item water;
    private Item wineBottle;
    private Item domesticBeer;
    private Item importedBeer;
    private Item cigarettes;
}
