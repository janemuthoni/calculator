package pau.paulo.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class RegisterScreen extends ActionBarActivity implements OnClickListener {
	 //declare variables.
	Button btnCancel, btnSubmit;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		//initialize variables.
		
		
		btnSubmit=(Button)findViewById(R.id.buttonRegisterSubmit);
		btnSubmit.setOnClickListener(this);
         
        btnCancel=(Button)findViewById(R.id.buttonRegisterCancel);
        btnCancel.setOnClickListener(this);
        		
		
	}

	@Override
	public void onClick(View v){
		switch (v.getId()) {
		case R.id.buttonRegisterSubmit:
			Toast.makeText(getApplicationContext(), "welcome to login screen", Toast.LENGTH_LONG).show();
			startActivity(new Intent(getApplicationContext(),LoginScreen.class));
			
			
			break;
		case R.id.buttonRegisterCancel:
			 Toast.makeText(getApplicationContext(), "welcome", Toast.LENGTH_LONG).show();
			 startActivity(new Intent(getApplicationContext(),RegisterScreen.class));
			

		default:
			break;
		}
		
		
		}
	
	    

	
	
	{
		// TODO Auto-generated method stub
		
	}
}
	
	
	


