package com.somnus.androidloadingdialogdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import com.somnus.androidloadingdialogdemo.view.LoadingDialog;

public class MainActivity extends ActionBarActivity {

	private LoadingDialog loadDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);// 取消标题栏
		setContentView(R.layout.activity_main);

		loadDialog = new LoadingDialog(this);
		loadDialog.setTitle("正在登录...");
	}

	public void onAction(View v) {
		if (loadDialog.isShowing()) {
			loadDialog.dismiss();
		} else {
			loadDialog.show();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
