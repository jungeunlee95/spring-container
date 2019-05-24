package com.cafe24.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cafe24.springcontainer.user.User;
import com.cafe24.springcontainer.user.User1;

public class ContainerTest {

	public static void main(String[] args) {
//		testBeanFactory();
		testApplicationContext();
	}
	
	public static void testApplicationContext() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("config/user/applicationContext2.xml");
		
		// 오류 : 빈설정 id나 name을 설정해야한다.
//		User1 user = (User1) appContext.getBean("user1"); 
//		System.out.println(user.getName());

		// class 타입으로 가져오기
		User1 user1 = appContext.getBean(User1.class);
		System.out.println(user1.getName());
		
		//name으로 가져오기
		User user = (User) appContext.getBean("user");
		System.out.println(user);
		
		//id로 가져오기
		user = (User) appContext.getBean("usr");
		System.out.println(user);
		
		User user2 = (User) appContext.getBean("usr2");
		System.out.println(user2);
		
		User user3 = (User) appContext.getBean("usr3");
		System.out.println(user3);
		
		User user4 = (User) appContext.getBean("usr4");
		System.out.println(user4);
		
		User user5 = (User) appContext.getBean("usr5");
		System.out.println(user5);
		
		// 자원정리
		((ConfigurableApplicationContext)appContext).close();
	}

	
	public static void testBeanFactory() {
		BeanFactory bf1 = 
				new XmlBeanFactory( new ClassPathResource( "config/user/applicationContext.xml" ) );
		
		// Auto-Configuration(Scanning) 설정인 경우
		// Bean의 id가 자동으로 만들어짐
		User1 user = (User1) bf1.getBean("user1"); // -> id로 검색 
		System.out.println(user.getName());

		
		// XML Bean 설정인 경우 id자동 부여가 되지 않음
		BeanFactory bf2 = 
				new XmlBeanFactory( new ClassPathResource( "config/user/applicationContext2.xml" ) );
		user = (User1)bf2.getBean(User1.class);
		System.out.println(user.getName());
		
	}
}
 





