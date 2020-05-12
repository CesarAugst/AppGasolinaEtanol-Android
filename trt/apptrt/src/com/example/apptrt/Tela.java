package com.example.apptrt;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("ShowToast") public class Tela extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela);
    }
    
public void Calculo (View v){
		final EditText gasosa = (EditText)findViewById(R.id.editText1);
		final EditText etanola = (EditText)findViewById(R.id.editText2);
    	double gas, eta, cal;
    	
    	gas = Double.parseDouble(gasosa.getText().toString());
    	eta = Double.parseDouble(etanola.getText().toString());
    	
    	cal = gas * 0.70;
    	
    	if (eta < cal){
    		Toast.makeText(this, "Ta compensando mais o alcool cumpadi", Toast.LENGTH_LONG).show();
    	}else{
    		Toast.makeText(this, "Ta compensando mais a gasosa cumpadi", Toast.LENGTH_LONG).show();
    	}
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tela, menu);
        return true;
    }
    
}
