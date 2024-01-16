package org.springframework.demo.beans.lifecycle;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;

/**
 * @author yyuweb@outlook.com
 * @date 2024/1/15
 */
public class LifecycleDemoB implements BeanFactoryAware, InitializingBean, SmartInitializingSingleton, DisposableBean {

	private BeanFactory beanFactory;

	public LifecycleDemoB() {
		System.out.printf("%s constructor%n", this.getClass().getName());
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
		System.out.printf("%s#setBeanFactory%n", this.getClass().getName());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.printf("%s#afterPropertiesSet()%n", this.getClass().getName());
	}

	@Override
	public void afterSingletonsInstantiated() {
		System.out.printf("%s#afterSingletonsInstantiated()%n", this.getClass().getName());
	}

	@Override
	public void destroy() throws Exception {
		System.out.printf("%s#destroy()%n", this.getClass().getName());
	}

	public void customInit() {
		System.out.printf("%s initMethod%n", this.getClass().getName());
	}

	public void customDestroy() {
		System.out.printf("%s destroyMethod%n", this.getClass().getName());
	}

	@PostConstruct
	public void postConstructInit() {
		System.out.printf("%s PostConstruct method%n", this.getClass().getName());
	}

}
