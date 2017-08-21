package com.bi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bi.beans.Bus;
import com.bi.beans.Car;

public class BITest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bi/common/application-context.xml"));
		/*Car car = factory.getBean("car2", Car.class);
		System.out.println(car);*/
		
		/*Bus bus = factory.getBean("bus",Bus.class);
		System.out.println(bus);*/
		
		/*Car car = factory.getBean("baseCar", Car.class);
		System.out.println(car);*/
		
		//For Constructor Injection
		Car car = factory.getBean("car1", Car.class);
		System.out.println(car);
	}

}
