package com.text.dagger2demo.beam;

import com.text.dagger2demo.dagger.TomCooker;

import javax.inject.Inject;

/**
 * Created by mengyuanyuan on 2017/7/31.
 */

public class SimpleMaker implements CoffeeMaker {
	Cooker cooker;
	@Inject
	public SimpleMaker(@TomCooker Cooker cooker) {
		this.cooker = cooker;
	}

	@Override
	public String makeCoffee() {
		return cooker.make();
	}
}
