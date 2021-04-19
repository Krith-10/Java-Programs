package SpringInit;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class UsingBeanProcessor implements BeanPostProcessor {
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanname) throws BeansException {
		
		System.out.println("In After Initialization method "+beanname);
		return bean;
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanname) throws BeansException {
		
		System.out.println("In Before Inititalization method "+beanname);
		return bean;
	}
}