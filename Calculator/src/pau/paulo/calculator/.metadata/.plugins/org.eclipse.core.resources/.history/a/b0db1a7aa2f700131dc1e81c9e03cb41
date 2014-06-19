package com.example.calculatorloise;

import android.support.v7.app.ActionBarActivity;
//import android.support.v7.app.ActionBar;
//import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
//import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
//import android.os.Build;

public class WelcomeScreen extends ActionBarActivity implements OnClickListener {
       //declaration of values
	 Button btnwelcomelogin,btnwelcomeregister;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		
		//initialization of values
		btnwelcomelogin = (Button) findViewById(R.id.welcomelogin);
		btnwelcomelogin.setOnClickListener(this);
		btnwelcomeregister = (Button) findViewById(R.id.welcomeregister);
        btnwelcomeregister.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId ()) {
		case R.id.welcomelogin:
			
			Toast.makeText(getApplicationContext(), "welcome",Toast.LENGTH_SHORT ).show();
			
			startActivity( new Intent(getApplication(),LoginScreen.class));
			break;
			
           case R.id.welcomeregister:
        	   
			Toast.makeText(getApplicationContext(), "Register here", Toast.LENGTH_SHORT).show();
			
			startActivity(new Intent(getApplicationContext() ,RegisterScreen.class));
			
			break;


		default:
			break;
		}
		
		
	}

	
}
