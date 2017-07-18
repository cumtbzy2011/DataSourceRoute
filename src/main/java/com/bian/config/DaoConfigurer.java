package com.bian.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author bianzy
 * @create 2017-07-18 18:00
 **/
@Configuration
public class DaoConfigurer extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder
    }
}
