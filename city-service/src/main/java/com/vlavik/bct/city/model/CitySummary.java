package com.vlavik.bct.city.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class CitySummary {

    private String country;
    private Integer population;
    private String imageUrl;
}
