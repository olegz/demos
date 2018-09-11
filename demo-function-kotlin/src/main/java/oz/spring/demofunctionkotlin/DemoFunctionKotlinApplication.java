package oz.spring.demofunctionkotlin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionCatalog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class DemoFunctionKotlinApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoFunctionKotlinApplication.class, args);
		FunctionCatalog functionCatalog = context.getBean(FunctionCatalog.class);

		//Funct
	}

	@Bean
	public Function<String, String> javaFunction() {
		return s -> s.toUpperCase();
	}
}
