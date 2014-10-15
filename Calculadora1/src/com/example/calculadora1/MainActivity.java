package com.example.calculadora1;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.MenuInflater;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	private Button botonSumar,botonRestar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //IDENTIFICACION 
        botonRestar = (Button) findViewById(R.id.restar);
        botonSumar = (Button) findViewById(R.id.sumar);
        
        //AÑADIR LISTENER
        botonSumar.setOnClickListener(new OnClickListener() {
        	
        	public void onClick (View v){
        		lanzarSumar();
        	}
        });
       
        botonRestar.setOnClickListener(new OnClickListener() {
        	
        	public void onClick (View v){
        		lanzarRestar();
        	}
        });
    }
   
    //LANZAMIENTO DE ACTIVIDADES
    public void lanzarSumar(){
    	Intent i = new Intent (this, Sumar.class);
    	startActivity(i);
    	
    }
    public void lanzarRestar(){
    	Intent i = new Intent (this, Restar.class);
    	startActivity(i);
    	
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
