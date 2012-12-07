package com.name.piloto;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class LesPilotoActivity extends Activity {

	private String periodoSelecionado;
	private Spinner selecionarPeriodo;
	ImageButton bt1;
	ImageButton bt2;
	ImageButton bt3;
	ImageButton bt4;
	ImageButton bt5;
	ImageButton bt6;
	ImageButton bt7;
	ImageButton bt8;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bt1 = (ImageButton ) findViewById(R.main.imageButton1);
		bt2 = (ImageButton ) findViewById(R.main.imageButton2);
		bt3 = (ImageButton ) findViewById(R.main.imageButton3);
		bt4 = (ImageButton ) findViewById(R.main.imageButton4);
		bt5 = (ImageButton ) findViewById(R.main.imageButton5);
		bt6 = (ImageButton ) findViewById(R.main.imageButton6);
		bt7 = (ImageButton ) findViewById(R.main.imageButton7);
		bt8 = (ImageButton ) findViewById(R.main.imageButton8);
		
		selecionarPeriodo = (Spinner) findViewById(R.main.selectPeriodo);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.periodos, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		selecionarPeriodo.setAdapter(adapter);
		
		periodoSelecionado = "1º Periodo";
		selecionarPeriodo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
	        public void onItemSelected(AdapterView<?> arg0, View arg1,
	                int position, long id) {
	        		periodoSelecionado = selecionarPeriodo.getSelectedItem().toString();
	        	//}
	    		if (periodoSelecionado.equalsIgnoreCase("1º Periodo")) {
	    			bt1.setImageResource(R.drawable.p1);
	    			bt2.setImageResource(R.drawable.labp1);
	    			bt3.setImageResource(R.drawable.calculo1);
	    			bt4.setImageResource(R.drawable.vetorial);
	    			bt5.setImageResource(R.drawable.ic);
	    			bt6.setImageResource(R.drawable.lpt);
	    			bt7.setVisibility(View.INVISIBLE);
	    			bt8.setVisibility(View.INVISIBLE);
	    		}
	    		else if (periodoSelecionado.equalsIgnoreCase("2º Periodo")) {
	    			bt1.setImageResource(R.drawable.p2);
	    			bt2.setImageResource(R.drawable.labp2);
	    			bt3.setImageResource(R.drawable.calculo2);
	    			bt4.setImageResource(R.drawable.grafos);
	    			bt5.setImageResource(R.drawable.discreta);
	    			bt6.setImageResource(R.drawable.fisica3);
	    			bt7.setVisibility(View.INVISIBLE);
	    			bt8.setVisibility(View.INVISIBLE);
	    		}
	    		else if (periodoSelecionado.equalsIgnoreCase("3º Periodo")) {
	    			bt1.setImageResource(R.drawable.eda);
	    			bt2.setImageResource(R.drawable.leda);
	    			bt3.setImageResource(R.drawable.probabilidade);
	    			bt4.setImageResource(R.drawable.linear);
	    			bt5.setImageResource(R.drawable.tc);
	    			bt6.setImageResource(R.drawable.fisica4);
	    			bt7.setVisibility(View.VISIBLE);
	    			bt7.setImageResource(R.drawable.gerencia);
	    			bt8.setVisibility(View.INVISIBLE);
	    		}
	    		else if (periodoSelecionado.equalsIgnoreCase("4º Periodo")) {
	    			bt1.setImageResource(R.drawable.oac);
	    			bt2.setImageResource(R.drawable.loac);
	    			bt3.setImageResource(R.drawable.plp);
	    			bt4.setImageResource(R.drawable.metodos);
	    			bt5.setImageResource(R.drawable.logica);
	    			bt6.setImageResource(R.drawable.si1);
	    			bt7.setVisibility(View.VISIBLE);
	    			bt7.setImageResource(R.drawable.es1);
	    			bt8.setVisibility(View.INVISIBLE);
	    		}
	    		else if (periodoSelecionado.equalsIgnoreCase("5º Periodo")) {
	    			bt1.setImageResource(R.drawable.atal);
	    			bt2.setImageResource(R.drawable.redes);
	    			bt3.setImageResource(R.drawable.compiladores);
	    			bt4.setImageResource(R.drawable.bd1);
	    			bt5.setImageResource(R.drawable.si2);
	    			bt6.setImageResource(R.drawable.les);
	    			bt7.setVisibility(View.VISIBLE);
	    			bt7.setImageResource(R.drawable.infosoc);
	    			bt8.setVisibility(View.INVISIBLE);
	    		}
	    		else if (periodoSelecionado.equalsIgnoreCase("6º Periodo")) {
	    			bt1.setImageResource(R.drawable.so);
	    			bt2.setImageResource(R.drawable.irc);
	    			bt3.setImageResource(R.drawable.lirc);
	    			bt4.setImageResource(R.drawable.ia1);
	    			bt5.setImageResource(R.drawable.bd2);
	    			bt6.setImageResource(R.drawable.opt1);
	    			bt7.setVisibility(View.VISIBLE);
	    			bt7.setImageResource(R.drawable.opt2);
	    			bt8.setVisibility(View.VISIBLE);
	    			bt8.setVisibility(R.drawable.direito);
	    		}
	    		else if (periodoSelecionado.equalsIgnoreCase("7º Periodo")) {
	    			bt1.setImageResource(R.drawable.msn);
	    			bt2.setImageResource(R.drawable.adsd);
	    			bt3.setImageResource(R.drawable.opt3);
	    			bt4.setImageResource(R.drawable.opt4);
	    			bt5.setImageResource(R.drawable.opt5);
	    			bt6.setImageResource(R.drawable.projeto1);
	    			bt7.setVisibility(View.VISIBLE);
	    			bt7.setImageResource(R.drawable.opt6);
	    			bt8.setVisibility(View.INVISIBLE);
	    		}
	    		else if (periodoSelecionado.equalsIgnoreCase("8º Periodo")) {
	    			bt1.setImageResource(R.drawable.opt7);
	    			bt2.setImageResource(R.drawable.opt8);
	    			bt3.setImageResource(R.drawable.opt9);
	    			bt4.setImageResource(R.drawable.opt10);
	    			bt5.setImageResource(R.drawable.opt11);
	    			bt6.setImageResource(R.drawable.projeto2);
	    			bt7.setVisibility(View.INVISIBLE);
	    			bt8.setVisibility(View.INVISIBLE);
	    		}
		 }
		public void onNothingSelected(AdapterView<?> arg0) {}
	});	

	}
}
