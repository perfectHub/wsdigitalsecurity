package demo.ws.security;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.ws.soap.HelloService;

public class WSSecurity {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("classpath:spring-client.xml");
		HelloService helloService = context.getBean("helloService",HelloService.class);
		String result = helloService.say("world");
		System.out.println(result);
	}
}
