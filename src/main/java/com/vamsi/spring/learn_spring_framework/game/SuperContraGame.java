package com.vamsi.spring.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("Super Contra Up");
	}
	public void down() {
		System.out.println("Super Contra Down");
	}
	public void left() {
		System.out.println("Super Contra left");
	}
	public void right() {
		System.out.println("Super Contra right");
	}
}
