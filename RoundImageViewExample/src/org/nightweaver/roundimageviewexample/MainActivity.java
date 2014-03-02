package org.nightweaver.roundimageviewexample;

import org.nightweaver.view.RoundImageView;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	RoundImageView img;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		img = (RoundImageView) this.findViewById(R.id.rd_img);
	}

	public void changeBorder(View view) {
		int r = (int) (Math.random() * 255);
		int g = (int) (Math.random() * 255);
		int b = (int) (Math.random() * 255);
		img.setBorderColor(Color.argb(255, r, g, b));
		img.invalidate();
	}

	public void changeRes(View view) {
		img.setImageResource(R.drawable.head01);
	}
}
