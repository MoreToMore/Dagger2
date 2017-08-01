package com.text.dagger2demo.dagger;

import com.text.dagger2demo.beam.Cooker;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mengyuanyuan on 2017/8/1.
 */
@Module
public class SimpleModule {
	@Provides
	@JimCooker
	Cooker provideJimCooker(){
		return new Cooker("jim","Espresso");
	}
	@Provides
	@TomCooker
	Cooker provideTomCooker(){
		return new Cooker("tom","Espresso");
	}
//	@Provides
//	CoffeeMaker provideCoffeeMaker(Cooker cooker){
//		return new SimpleMaker(cooker);
//	}
}
