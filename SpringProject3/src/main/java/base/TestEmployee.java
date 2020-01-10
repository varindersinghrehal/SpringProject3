package base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {

		final String fileName = "applicationContext.xml";
		@SuppressWarnings({"resource"})
		ApplicationContext context = new ClassPathXmlApplicationContext(fileName);

		Employee e1, e2;
		e1 = (Employee) context.getBean("empl1");
		e2 = (Employee) context.getBean("empl2");

		System.out.println(e1);
		System.out.println(e2);

		Address a1, a2;
		a1 = (Address) context.getBean("addr1");
		a2 = (Address) context.getBean("addr2");
		System.out.println(a1);
		System.out.println(a2);

	}
}
