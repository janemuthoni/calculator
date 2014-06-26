package pau.paulo.calculator;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeScreen extends ActionBarActivity implements OnClickListener {
	 String         Strnumberone,Strnumbertwo,StrResult;
	 int            numberone,numbertwo,ans;
	 
	 double         number1,number2;
	
	 EditText      etnumberone, etnumbertwo,etnumber1;
	 Button        btnadd, btnmultiply, btndivision, btnsubtraction;
	 TextView      tvresults;
     Calculations  calcs;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		
		tvresults=(TextView)findViewById(R.id.tvresults);
	
		
		etnumberone=(EditText)findViewById(R.id.editnumberone);
		
		etnumbertwo=(EditText)findViewById(R.id.editTextnumbertwo);
		
		
		btnadd=(Button)findViewById(R.id.buttonAdd);
		btnadd.setOnClickListener(this);
		
		
		btnmultiply=(Button)findViewById(R.id.buttonmultiply);
		btnmultiply.setOnClickListener(this);
		
		btndivision=(Button)findViewById(R.id.buttondivision);
		btndivision.setOnClickListener(this);
		
		btnsubtraction=(Button)findViewById(R.id.buttonsubtraction);
		btnsubtraction.setOnClickListener(this);
		calcs = new Calculations();
		
		//integer to String.
		Strnumberone= etnumberone.getText().toString();
		//integer to String.
	    Strnumbertwo= etnumbertwo.getText().toString();
	    
		//convert Double to String.
	    number1=Double.parseDouble(Strnumberone);
	    number2=Double.parseDouble(Strnumberone);
	    
	  //convert String to Integer.
        numberone=Integer.parseInt(Strnumberone);
        numbertwo=Integer.parseInt(Strnumbertwo);
	       
       
	}		 
	   
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonAdd:
			Toast.makeText(getApplicationContext(), "welcome to home screen", Toast.LENGTH_LONG).show();
			//startActivity(new Intent(getApplicationContext(),HomeScreen.class));
			
			  int ans = calcs.addition(numberone,numbertwo);
	         //convert integer back to String
	         StrResult=String.valueOf(ans);
	         //Displaying the answer.
	         tvresults.setText("result is " + StrResult);
			
break;
		case   R.id.buttonsubtraction:
		
		 int answer = calcs.subtraction(numberone, numbertwo);
	        //convert to String.
	        StrResult=String.valueOf(answer);
	        //Displaying the answer.
	        tvresults.setText(StrResult);

break;
		case  R.id.buttondivision:
			
		    
	        double answ = calcs.division(number1,number2);
	        //convert to String.
	        StrResult=String.valueOf(answ);
	      //Displaying the answer.
	        tvresults.setText(StrResult);
	break;
	
		case R.id.buttonmultiply:
			
	        double anser = calcs.muliplication(number1, number2);
	        //convert to String.
	        StrResult=String.valueOf(anser);
	        //Displaying the answer.
	        tvresults.setText(StrResult);
			
			
	
			
default:
			break;
		}


	
	}


}
	








