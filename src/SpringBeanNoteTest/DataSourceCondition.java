package SpringBeanNoteTest;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DataSourceCondition implements Condition {
	
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		Environment env = context.getEnvironment();
		return env.containsProperty("jdbc.database.driver")
			&& env.containsProperty("jdbc.database.url")
			&& env.containsProperty("jdbc.database.username")
			&& env.containsProperty("jdbc.database.password");
	}
}
