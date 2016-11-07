package com.povedof.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {"F1","F2","F3"};
	
	@Override
	public String getFortune() {
		Random random = new Random();
		String fortune = fortunes[random.nextInt(3)];
		return fortune;
	}

}
