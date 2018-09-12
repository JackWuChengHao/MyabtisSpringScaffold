package com.oop.inter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect    // for aop
@Component // for auto scan
@Order(0)  // execute before @Transactional
public class DataSourceInterceptor {

	    @Pointcut("execution(* com.oop.services.*.testAddUser(..))")
	    public void dataSourceDM(){};
	    
	    @Pointcut("execution(* com.oop.services.*.testThreeUser(..))")
	    public void dataSource(){};
	    
	    @Before("dataSource()")
	    public void beforedataSource(JoinPoint jp) {
	    	System.out.println("set datasource");
	    	DataSourceManager.set(DataSource.Master);
	    }
	    
	    @Before("dataSourceDM()")
	    public void beforedataSourceDM(JoinPoint jp) {
	    	System.out.println("set datasourceDM");
	    	DataSourceManager.set(DataSource.Master_DM);
	    }

}
