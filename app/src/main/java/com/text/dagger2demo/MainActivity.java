package com.text.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.text.dagger2demo.beam.CoffeeMachine;
import com.text.dagger2demo.dagger.DaggerSimpleComponent;
import com.text.dagger2demo.dagger.SimpleComponent;
import com.text.dagger2demo.dagger.SimpleModule;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {
//
	@BindView(R.id.button)
	Button button;
	@BindView(R.id.tv_cotent)
	TextView tvCotent;
	@Inject
	CoffeeMachine coffeeMachine;
	private Unbinder unbinder;
	private SimpleComponent simpleComponent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		unbinder = ButterKnife.bind(this);
//		Cooker cooker = new Cooker("James","Espresso");
//		coffeeMachine = new CoffeeMachine(cooker);
		simpleComponent = DaggerSimpleComponent.builder().simpleModule(new SimpleModule()).build();
		simpleComponent.inject(MainActivity.this);


}

	@OnClick(R.id.button)
	public void onViewClicked() {
		tvCotent.setText(coffeeMachine.makeCoffee());

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		unbinder.unbind();
	}
}
/*
* 1、如果是接口依赖（参数，实体类则可以通过inject标注构造方法），则需要module提供。
* 2、inject标记实体类构造方法之后，所需参数也会去module或者寻求相应的inject类。
* 3、提供依赖的方式可以是module、inject两种。
*
* */
