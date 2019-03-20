package SpringBeanNoteTest;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;

public class BeanNoteTest {
	
	@Bean(name = "DataSource")
	public DataSource getDataSource() {
		Properties props = new Properties();
		props.setProperty("driver", "com.mysql.cj.jdbc.Driver");
		props.setProperty("url", "jdbc://mysql://localhost:3306/chapter12");
		props.setProperty("username", "root");
		props.setProperty("password", "123456");
		DataSource dataSource = null;
		try {
			dataSource = BasicDataSourceFactory.createDataSource(props);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return dataSource;
	}
}

class BasicDataSourceFactory{
	public static DataSource createDataSource(Properties props) {
		return null;
	}
}
