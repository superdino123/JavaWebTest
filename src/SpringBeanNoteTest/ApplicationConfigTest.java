package SpringBeanNoteTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationConfigTest {
	
	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Role role = context.getBean(Role.class);
		RoleService roleService = context.getBean(RoleService.class);
		roleService.printRoleInfo(role);
		context.close();
	}
}
