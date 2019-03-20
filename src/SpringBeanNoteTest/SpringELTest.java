package SpringBeanNoteTest;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpringELTest {
	public static void main(String[] args) {
		//表达式解析器
		ExpressionParser parser = new SpelExpressionParser();
		//设置表达式
		Expression exp = parser.parseExpression("'hello world'");
		String str = (String)exp.getValue();
		System.out.println(str);	
	}
}
