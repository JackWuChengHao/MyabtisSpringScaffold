package com.oop.inter;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class ThreadLocalRountingDataSource extends AbstractRoutingDataSource{

	 @Override
	    protected Object determineCurrentLookupKey() {
	        return DataSourceManager.get();
	    }
	
}
