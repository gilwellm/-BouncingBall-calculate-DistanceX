package gilwellm.bouncingball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
	Button button;
	EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button=(Button)findViewById(R.id.button1);
        editText=(EditText)findViewById(R.id.calHeight);
        button.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                    	  String Height  =  editText.getText().toString();
                        // TODO Auto-generated method stub
                    	  if( editText.getText().toString().trim().equals(""))
                    	  {    
                    		  editText.setError( "The Height is Required!" );
                    	    //You can Toast a message here that the Username is Empty
                    	  }
                    	 else
                    	 {
                    	    Intent i = new Intent(getApplicationContext(), Calculate.class);
                    	    i.putExtra("heightInput",editText.getText().toString());
                    	    startActivity(i);
                    	 }  
                    	  
                    	  
                      /*  Intent i = new Intent(getApplicationContext(),Calculate.class);
                        i.putExtra("EXTRA_SESSION_ID", Height);
                        startActivity(i);*/
                    }
                });
        
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
