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
public class TransportationPrices {

    private Item ticket;
    private Item monthly;

    // TODO: add taxi, bicycle
}
