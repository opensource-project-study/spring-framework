package org.springframework.demo.basic.beans;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

/**
 * @author yyuweb@outlook.com
 * @date 2024/1/9
 */
@Component
public class DependencyDemoB {

	@Resource
	private DependencyDemoA dependencyDemoA;
}
