package com.vlavik.bct.city.model;

import com.vlavik.bct.city.model.prices.MarketPrices;
import com.vlavik.bct.city.model.prices.RestaurantPrices;
import com.vlavik.bct.city.model.prices.TransportationPrices;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "cities")
public class City {

    @Id
    private String id;

    private String cityName;

    private CitySummary summary;

    private RestaurantPrices restaurantPrices;
    private MarketPrices marketPrices;
    private TransportationPrices transportationPrices;
}
