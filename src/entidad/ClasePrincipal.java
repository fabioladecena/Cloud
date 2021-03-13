package entidad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClasePrincipal {
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("recursos/context.xml");

		Casa c = (Casa) context.getBean("casa");
		System.out.println(c);
	}
}
