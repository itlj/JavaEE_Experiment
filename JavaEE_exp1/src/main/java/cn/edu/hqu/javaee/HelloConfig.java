package cn.edu.hqu.javaee;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackageClasses= {HelloWorld.class})
public class HelloConfig {

}
