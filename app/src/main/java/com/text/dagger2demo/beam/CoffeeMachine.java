package com.text.dagger2demo.beam;

/**
 * Created by mengyuanyuan on 2017/7/31.
 */

/**
 * 这是一个制作Coffee的例子
 * CoffeeMaker是对制作Coffee过程的一个封装
 * 制作Coffee需要实现CoffeeMarker的makeCoffee方法
 */
public class CoffeeMachine {
	private CoffeeMaker maker;
	public CoffeeMachine(Cooker cooker){
		maker = new SimpleMaker(cooker);
	}
	public String makeCoffee(){
		return maker.makeCoffee();
	}
}
