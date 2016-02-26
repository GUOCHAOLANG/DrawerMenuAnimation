package com.example.dma;

import com.example.dma.DrawerMenu.OnMenuItemGClickListener;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		DrawerMenu dd = (DrawerMenu)findViewById(R.id.one);
		//接口回调 处理
		dd.setOnMenuItemGClickListener(new OnMenuItemGClickListener() {
			
			public void onClick(View view, int pos) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "item=" + pos,Toast.LENGTH_LONG).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}
