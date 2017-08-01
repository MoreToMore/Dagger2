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
	Cooker provideCooker(){
		return new Cooker("James","Espresso");
	}
//	@Provides
//	CoffeeMaker provideCoffeeMaker(Cooker cooker){
//		return new SimpleMaker(cooker);
//	}
}
