package SpringTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JuiceMaker2Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("SpringTest/spring-cfg.xml");
		JuiceMaker2 juiceMaker2 = (JuiceMaker2)ctx.getBean("juiceMaker2");
		System.out.println(juiceMaker2.makeJuice());
		ctx.close();
	}
}
/* 总结
 * 1.ClassPathXmlApplicationContext 路径为程序中的绝对路径，不以当前文件路径为准
 * 2.xml的配置的属性赋值，当属性没有getSet操作时，且为private属性，则赋值报错
**/
/* Output:
[Source]对象source开始实例化
[Source]对象source实例化完成
[JuiceMaker2]调用BeanNameAware接口的setBeanName方法
[JuiceMaker2]调用BeanFactoryAware接口的setBeanFactory方法
[JuiceMaker2]调用ApplicationContextAware接口的setApplicationContext方法
[JuiceMaker2]对象juiceMaker2开始实例化
[JuiceMaker2]调用InitializingBean接口的afterPropertiesSet方法
[JuiceMaker2]执行自定义初始化方法
[JuiceMaker2]对象juiceMaker2实例化完成
这是一杯由贡茶饮品店，提供的大杯少糖橙汁
调用接口DisposableBean的destroy方法
[JuiceMaker2]执行自定义销毁方法
 * *///:~
