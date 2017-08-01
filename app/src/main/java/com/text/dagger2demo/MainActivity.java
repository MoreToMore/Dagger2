package com.text.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.text.dagger2demo.beam.CoffeeMachine;
import com.text.dagger2demo.beam.Cooker;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

	@BindView(R.id.button)
	Button button;
	@BindView(R.id.tv_cotent)
	TextView tvCotent;
	private CoffeeMachine coffeeMachine;
	private Unbinder unbinder;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		unbinder = ButterKnife.bind(this);
		Cooker cooker = new Cooker("James","Espresso");
		coffeeMachine = new CoffeeMachine(cooker);
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
