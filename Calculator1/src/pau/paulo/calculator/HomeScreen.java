package pau.paulo.calculator;

import android.R.string;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeScreen extends ActionBarActivity implements OnClickListener {
	
	 EditText     etnumberone, etnumbertwo;
	 Button       btnadd, btnmultiply, btndivision, btnsubtraction;
	 
public int    addition( int x, int y) {
	    
	      int ans=x+y;
	      return ans;
	      }
public int  subtraction(int x,int y){
	
	int answer=x-y;
	return answer;
}
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		
		
		
		etnumberone=(EditText)findViewById(R.id.editnumberone);
		etnumberone.setOnClickListener(this);
		
		etnumbertwo=(EditText)findViewById(R.id.editTextnumbertwo);
		etnumbertwo.setOnClickListener(this);
		
		btnadd=(Button)findViewById(R.id.buttonAdd);
		btnadd.setOnClickListener(this);
		
		
		btnmultiply=(Button)findViewById(R.id.buttonmultiply);
		btnmultiply.setOnClickListener(this);
		
		btndivision=(Button)findViewById(R.id.buttondivision);
		btndivision.setOnClickListener(this);
		
		btnsubtraction=(Button)findViewById(R.id.buttonsubtraction);
		btnsubtraction.setOnClickListener(this);
		
		
		
		
		
		
		

	}

	
	

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonAdd:
			Toast.makeText(getApplicationContext(), "welcome to home screen", Toast.LENGTH_LONG).show();
			startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
			
			
			break;

		default:
			break;
		}
		
	}

}
