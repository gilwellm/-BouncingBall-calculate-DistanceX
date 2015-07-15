package gilwellm.bouncingball;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Calculate extends Activity {
	TextView displayXX;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate);
        displayXX = (TextView)findViewById(R.id.displayX);
        //Bundle bundle = getIntent().getExtras();

        /* Get values from Intent */
        Intent intent = getIntent();
         
        String name  = intent.getStringExtra("heightInput");
        
        //start calcutaion
        String  inputHeight=name;
        double inputHeightDouble = Double.parseDouble(inputHeight);
       //double a=9.8;
        //Sn = a1(1-rn)/(1-r)
        //for the rises
        //7(2/3)^n 
        
        //the height is //inputheigh
        //the height reduces by 25 percent
        //25/100 of the initial bounce
        double reducedPercentage=0.25;
        double distanceTraveled=(inputHeightDouble/reducedPercentage);
       
        
        String tot = new Double(distanceTraveled).toString();
   
        //the displacement function is yA(t)=H−1/2gt2.
     //double   name= (0.5*a*t);
         
     displayXX.setText(tot);
        
    }
}
