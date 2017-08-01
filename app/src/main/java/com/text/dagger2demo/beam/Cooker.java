package com.text.dagger2demo.beam;

/**
 * Created by mengyuanyuan on 2017/7/31.
 */

public class Cooker {
	String name; //咖啡师名字
	String coffeeKind; //制作咖啡的类型

	public Cooker(String name,String coffeeKind){
		this.name = name;
		this.coffeeKind = coffeeKind;
	}

	public String make(){
		return name +" make " + coffeeKind; //咖啡师制作Coffee的过程
	}
}
