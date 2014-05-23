package com.example.hellogalaxy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()) {
		case R.id.btnOK:
			EditText etv1 = (EditText)findViewById(R.id.editFirst);
				String inputMsg1 = etv1.getText().toString();
			EditText etv2 = (EditText)findViewById(R.id.editFamiry);
				String inputMsg2 = etv2.getText().toString();

			TextView tv = (TextView)findViewById(R.id.txvMsg);
			tv.setText("あなたでしたか、" + inputMsg1 + inputMsg2 + "さん。");
		}

	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		Button btnOK = (Button)findViewById(R.id.btnOK);
		btnOK.setOnClickListener(this);
		super.onResume();
	}



}
