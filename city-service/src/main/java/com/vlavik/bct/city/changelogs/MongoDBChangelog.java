package com.vlavik.bct.city.changelogs;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.vlavik.bct.city.model.City;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@ChangeLog
public class MongoDBChangelog {

    @Profile("local")
    @ChangeSet(order = "001", id = "fillCities", author = "Admin", runAlways = true)
    public void fillLocalDataBase(MongoTemplate mongoTemplate) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        URL resourceLocation = getClass().getClassLoader().getResource("city.json");

        List<City> cities = objectMapper.readValue(resourceLocation, new TypeReference<List<City>>() {
        });

        cities.forEach(mappedCity -> {
            Query query = new Query();
            query.addCriteria(Criteria.where("cityName")
                    .is(mappedCity.getCityName()));
            City city = mongoTemplate.findOne(query, City.class);
            mongoTemplate.save(mappedCity);
        });
    }
}
