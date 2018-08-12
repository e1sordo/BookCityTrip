package com.vlavik.bct.city.configuration;

import com.github.mongobee.Mongobee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoDBConfiguration {

    private final String databaseName;
    private final String databaseUri;
    private final String changeLogPath;

    @Autowired
    public MongoDBConfiguration(@Value("${spring.data.mongodb.database}") String databaseName,
                                @Value("${spring.data.mongodb.uri}") String databaseUri,
                                @Value("${mongobee.changelog.path}") String changeLogPath) {
        this.databaseName = databaseName;
        this.databaseUri = databaseUri;
        this.changeLogPath = changeLogPath;
    }

    @Bean
    public Mongobee mongobeeConfig() throws Exception {

        Mongobee runner = new Mongobee(databaseUri);
        runner.setDbName(databaseName);
        runner.setChangeLogsScanPackage(changeLogPath);

        return runner;
    }
}
