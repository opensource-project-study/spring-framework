package org.springframework.demo.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyuweb@outlook.com
 * @date 2024/1/17
 */
public class BeanDemoMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"xml/Demo.xml");
		context.close();
	}
}
