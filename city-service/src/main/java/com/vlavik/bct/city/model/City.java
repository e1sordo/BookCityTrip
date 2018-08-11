package com.vlavik.bct.city.model;

import com.vlavik.bct.city.model.prices.MarketsPrices;
import com.vlavik.bct.city.model.prices.RestaurantPrices;
import com.vlavik.bct.city.model.prices.TransportationPrices;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
@Document(collection = "cities")
public class City {

    @Id
    private Long id;

    private CitySummary summary;

    private RestaurantPrices restaurantPrices;
    private MarketsPrices marketsPrices;
    private TransportationPrices transportationPrices;
}
