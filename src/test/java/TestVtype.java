import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yztc.mymovie.action.VtypeAction;



public class TestVtype {
	@Test
	public void testSF(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		SessionFactory sf=ac.getBean("sessionFactory",SessionFactory.class);
		System.out.println(sf);
	}
	
	@Test
	public void testFindAll(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		VtypeAction va=ac.getBean("vtypeAction",VtypeAction.class);
				
		System.out.println(va);
	}
}
