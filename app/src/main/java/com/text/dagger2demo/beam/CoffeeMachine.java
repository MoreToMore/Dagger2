package com.text.dagger2demo.beam;

/**
 * Created by mengyuanyuan on 2017/7/31.
 */

import javax.inject.Inject;

/**
 * 这是一个制作Coffee的例子
 * CoffeeMaker是对制作Coffee过程的一个封装
 * 制作Coffee需要实现CoffeeMarker的makeCoffee方法
 */
public class CoffeeMachine {
//	@Inject
	SimpleMaker maker;
//	public CoffeeMachine(Cooker cooker){
//		maker = new SimpleMaker(cooker);
//	}
	@Inject
	public CoffeeMachine(SimpleMaker maker) {
		this.maker = maker;
	}
//	CoffeeMaker maker;
//	@Inject
//	public CoffeeMachine(CoffeeMaker maker) {
//		this.maker = maker;
//	}

	public String makeCoffee(){
		return maker.makeCoffee();
	}
}
