package DemoOnSprings7.DemoOnSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.ApplicationContext;

@Configuration
@ComponentScan(basePackages = "DemoOnSprings7.DemoOnSpring")
class AppConfig{
	 //AppCofig class is used for configuration
}
public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AutowiredCar car = context.getBean(AutowiredCar.class);
		car.drive();
		car.displayEngineType("petrol");

	}

}
