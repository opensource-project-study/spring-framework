package org.springframework.demo.basic.beans;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


/**
 * @author yyuweb@outlook.com
 * @date 2024/1/9
 */
@Component
public class DependencyDemoA {

	@Resource
	private DependencyDemoB dependencyDemoB;

	public void sayHello() {
		System.out.println("hello world!");
	}
}
