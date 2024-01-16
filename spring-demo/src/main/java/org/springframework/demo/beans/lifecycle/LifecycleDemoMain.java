package org.springframework.demo.beans.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyuweb@outlook.com
 * @date 2024/1/16
 */
public class LifecycleDemoMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"xml/Demo.xml");
		context.close();
	}
}
