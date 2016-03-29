package com.example.inputcontrols;

import com.example.inputcontrols.MainActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Button button;
	private TextView textView1;
	private EditText editText1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.button1);
		textView1 = (TextView) findViewById(R.id.textView1);
		editText1 = (EditText) findViewById(R.id.editText1);
		ReplaceText replaceText = new ReplaceText();
		button.setOnClickListener(replaceText);

	}

	private class ReplaceText implements OnClickListener {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String input = editText1.getText().toString();
			textView1.setText(input);

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
