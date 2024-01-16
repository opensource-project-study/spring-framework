package org.springframework.demo.beans.dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyuweb@outlook.com
 * @date 2024/1/9
 */
public class DependencyDemoMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
						"xml/Demo.xml");
		DependencyDemoA dependencyDemoA = (DependencyDemoA) context.getBean("dependencyDemoA");
		dependencyDemoA.sayHello();
	}
}
