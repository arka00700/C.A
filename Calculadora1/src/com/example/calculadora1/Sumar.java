package com.example.calculadora1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;	
	


public class Sumar extends Activity {
	private Button bCalcularSuma;
	private OnClickListener OnClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			calcular();
			
		}
	};
		
		
	

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sumar);
  
		//IDENTIFICACION 
		bCalcularSuma = (Button) findViewById(R.id.calcularSuma);
    
    
		//AÑADIR LISTENER
		bCalcularSuma.setOnClickListener(OnClickListener);
    	
		}
	private void calcular(){
		
		EditText num1 = (EditText) findViewById(R.id.sumaNum1);
		EditText num2 = (EditText) findViewById(R.id.sumaNum2);
		
		int numero1 = Integer.parseInt(num1.getText().toString()); 
		int numero2 = Integer.parseInt(num2.getText().toString());
		int res=numero1+numero2;
		
		TextView v = (TextView) findViewById(R.id.textView1);
		v.setText("El resultado es: " + res);
	}
}








