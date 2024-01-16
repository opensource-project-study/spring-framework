package org.springframework.demo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.demo.beans.lifecycle.LifecycleDemoB;
import org.springframework.stereotype.Component;

/**
 * @author yyuweb@outlook.com
 * @date 2024/1/16
 */
@Component
public class BeanDemoConfig {

	@Bean(initMethod = "customInit", destroyMethod = "customDestroy")
	public LifecycleDemoB lifecycleDemoB() {
		return new LifecycleDemoB();
	}
}
