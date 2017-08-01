package com.text.dagger2demo.beam;

/**
 * Created by mengyuanyuan on 2017/7/31.
 */

public class SimpleMaker implements CoffeeMaker {

	Cooker cooker;

	public SimpleMaker(Cooker cooker) {
		this.cooker = cooker;
	}

	@Override
	public String makeCoffee() {
		return cooker.make();
	}
}
