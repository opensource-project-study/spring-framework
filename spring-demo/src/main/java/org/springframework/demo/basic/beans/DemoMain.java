package org.springframework.demo.basic.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyuweb@outlook.com
 * @date 2024/1/9
 */
public class DemoMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
						"xml/Demo.xml");
		context.setAllowCircularReferences(false);
		DependencyDemoA dependencyDemoA = (DependencyDemoA) context.getBean("dependencyDemoA");
		dependencyDemoA.sayHello();
	}
}
