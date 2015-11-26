package com.example.projsnct;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void buttonClick() {
		SCTOpenHelper inserir = new SCTOpenHelper();
		inserir.onUpgrade();
	}

	public void buttonClickSearch () {
		SCTOpenHelper inserir = new SCTOpenHelper();
		inserir.buscar();
	}

}
