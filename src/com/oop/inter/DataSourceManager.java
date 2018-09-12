package com.oop.inter;

public class DataSourceManager {
		
	 private static final ThreadLocal<DataSource> dataSourceTypes = new ThreadLocal<DataSource>(){
	        @Override
	        protected DataSource initialValue(){
	            return DataSource.Master;
	        }
	    };
	    
	    public static DataSource get(){
	        return dataSourceTypes.get();
	    }
	    
	    public static void set(DataSource dataSourceType){
	        dataSourceTypes.set(dataSourceType);
	    }
	    
	    public static void reset(){
	        dataSourceTypes.set(DataSource.Master);
	    }
	    
}
