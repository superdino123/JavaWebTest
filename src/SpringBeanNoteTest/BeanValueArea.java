package SpringBeanNoteTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanValueArea {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Role RoleService = ctx.getBean(Role.class);
		Role RoleService2 = ctx.getBean(Role.class);
		System.out.println(RoleService == RoleService2);
	}
}
