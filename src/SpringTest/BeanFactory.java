package SpringTest;

public interface BeanFactory {
	String FACTORY_BEAN_PREFIX = "&";
	
	//获取配置给IoC容器的Bean
	Object getBean(String name) throws BeansException;
	
	<T> T getBean(Class<T> requiredType) throws BeansException;
	
	Object getBean(String name, Object... args) throws BeansException;
	
	<T> T getBean(Class<T> requiredType, Object... args) throws BeansException;
	
	boolean containsBean(String name);
	
	//是否单例
	boolean isSingleton(String name) throws NoSuchBeanDefinitionException;
	
	//当从容器中获取Bean，容器就生成一个新的实例
	boolean isPrototype(String name) throws NoSuchBeanDefinitionException;
	
	boolean isTypeMatch(String name, ResolvableType typeToMatch) throws NoSuchBeanDefinitionException;
	
	boolean isTypeMatch(String name, Class<?> typeToMatch) throws NoSuchBeanDefinitionException;
	
	Class<?> getType(String name) throws NoSuchBeanDefinitionException;
	
	//获取别名
	String[] getAliases(String name);
}

class BeansException extends Exception{
	
}

class NoSuchBeanDefinitionException extends Exception{
	
}

class ResolvableType{
	
}
