package com.example.calculadora1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


	public class Restar extends Activity {
		private Button bCalcularResta;
		private OnClickListener OnClickListener= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calcular();
			}
		};
				
				
				
		public void onCreate (Bundle savedInstances){
			super.onCreate(savedInstances);
			setContentView(R.layout.restar);

			//IDENTIFICACION 
			bCalcularResta = (Button) findViewById(R.id.calcularResta);
	    
	    
			//AÑADIR LISTENER
			bCalcularResta.setOnClickListener(OnClickListener);
		}
		private void calcular(){
			
			EditText num1 = (EditText) findViewById(R.id.restaNum1);
			EditText num2 = (EditText) findViewById(R.id.restaNum2);
			
			int numero1 = Integer.parseInt(num1.getText().toString()); 
			int numero2 = Integer.parseInt(num2.getText().toString());
			int res=numero1-numero2;
			
			TextView v = (TextView) findViewById(R.id.resultadoResta);
			v.setText("El resultado es: " + res);
		}
	}