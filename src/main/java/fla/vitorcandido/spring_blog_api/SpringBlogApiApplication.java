package fla.vitorcandido.spring_blog_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "fla.vitorcandido.spring_blog_api")
public class SpringBlogApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBlogApiApplication.class, args);
	}

}
