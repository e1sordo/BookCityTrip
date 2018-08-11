package com.vlavik.bct.city.model;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class PriceRange {

    private BigDecimal minimum;
    private BigDecimal normal;
    private BigDecimal maximum;
}
