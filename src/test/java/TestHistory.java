import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestHistory {

	@Test
	public void testFindAll(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		SessionFactory sf=ac.getBean("sessionFactory",SessionFactory.class);
		System.out.println(sf);
	}
}
