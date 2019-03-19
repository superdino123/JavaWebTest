package SpringBeanNoteTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
	public static void main(String[] args) {
		//初始化IoC容器
		ApplicationContext context = new AnnotationConfigApplicationContext(PojoConfig.class);
		Role role = context.getBean(Role.class);
		System.err.println(role.getId());
	}
}
