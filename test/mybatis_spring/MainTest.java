package mybatis_spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.oop.controller.userHandler;
import com.oop.services.insertUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application.xml")
public class MainTest {

	@SuppressWarnings("unused")
	@Autowired
	private userHandler uh;

	
	
	@SuppressWarnings("resource")
	@Test
	public void testSpringWithMybatis() {
		//=========================================================
		
		ApplicationContext ac = new  ClassPathXmlApplicationContext("application.xml");
		insertUser iu  = ac.getBean(insertUser.class);
		
		try {
			iu.testThreeUser();
			iu.testAddUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//=========================================================

	}

}
