package cn.edu.hqu.javaee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(HelloConfig.class);
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.hello();
		context.close();
	}
}
