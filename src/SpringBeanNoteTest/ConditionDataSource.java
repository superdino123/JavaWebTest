package SpringBeanNoteTest;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

public class ConditionDataSource {
	@Bean(name = "conditionDataSource")
	@Conditional({DataSourceCondition.class})
	public DataSource getDevDataSource(
			@Value("${jdbc.database.driver}") String driver,
			@Value("${jdbc.database.url}") String url,
			@Value("${jdbc.database.username}") String username,
			@Value("${jdbc.database.password}") String password) {
		Properties props = new Properties();
		props.setProperty("driver", "com.mysql.jdbc.Driver");
		props.setProperty("url", "jdbc:mysql://localhost:3306/chapter12");
		props.setProperty("username", "root");
		props.setProperty("password", "123456");
		DataSource dataSource = null;
		try {
			dataSource = null;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return dataSource;
	}
}
