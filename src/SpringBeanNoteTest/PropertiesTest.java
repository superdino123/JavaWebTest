package SpringBeanNoteTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertiesTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigProperties.class);
		String url = context.getEnvironment().getProperty("jdbc.database.url");
		System.out.println(url);
	}
}
