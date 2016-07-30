package com.haoqi.mycordova;

import org.apache.cordova.CordovaActivity;

import android.os.Bundle;

public class CordovaMainActivity extends CordovaActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		loadUrl(launchUrl);
	}

}
