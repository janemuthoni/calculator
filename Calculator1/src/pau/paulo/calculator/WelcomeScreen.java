package pau.paulo.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class WelcomeScreen extends ActionBarActivity implements OnClickListener {

	Button btnlogin, btnregister;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// initialize.
		setContentView(R.layout.welcome);

		btnlogin = (Button) findViewById(R.id.buttonlogin);
		btnlogin.setOnClickListener(this);

		btnregister = (Button) findViewById(R.id.buttonregister);
		btnregister.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		switch (v.getId()) {
		case R.id.buttonlogin:
			Toast.makeText(getApplicationContext(), "welcome to home screen", Toast.LENGTH_SHORT).show();
			
			 startActivity(new Intent(getApplicationContext(), LoginScreen.class));
			break;

		case R.id.buttonregister:
		  Toast.makeText(getApplicationContext(),"welcome to register",Toast.LENGTH_SHORT).show();
		  startActivity(new Intent(getApplicationContext(),RegisterScreen.class));

		default:
			break;
		}
	}

}

// @Override

// @Override
// public void onClick(View v) {
// TODO Auto-generated method stub
// Intent o=new Intent(getApplicationContext(),register.class);
// startActivity(o);

// }
// });

// btnCancel=(Button)findViewById(R.id.Cancel);
// btnCancel.setOnClickListener(new View.OnClickListener() {

// @Override
// public void onClick(View v) {
// TODO Auto-generated method stub
// Intent n=new Intent(getApplicationContext(),Welcome.class);
// startActivity(n);

// }
// });

// }

