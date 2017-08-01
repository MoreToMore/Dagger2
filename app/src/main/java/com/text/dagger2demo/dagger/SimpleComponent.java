package com.text.dagger2demo.dagger;

import com.text.dagger2demo.MainActivity;

import dagger.Component;

/**
 * Created by mengyuanyuan on 2017/8/1.
 */
@Component(modules=SimpleModule.class)
public interface SimpleComponent {
	void inject(MainActivity mainActivity);
}
