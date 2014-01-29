package com.example.firsttest;

import android.os.Bundle;
//import android.app.Activity;
import android.view.Menu;

import org.apache.cordova.Config;
import org.apache.cordova.*;


public class MainActivity extends  DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl(Config.getStartUrl());
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
