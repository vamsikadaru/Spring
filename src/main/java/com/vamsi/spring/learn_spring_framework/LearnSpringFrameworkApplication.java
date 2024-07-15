package com.vamsi.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vamsi.spring.learn_spring_framework.enterprise.example.web.MyWebController;
import com.vamsi.spring.learn_spring_framework.game.GameRunner;


@SpringBootApplication
//@ComponentScan("com.vamsi.spring.learn_spring_framework1")
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
		
//		GamingConsole game = new PacmanGame();
//		GameRunner runner = new GameRunner(game);
		
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
