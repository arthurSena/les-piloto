package com.name.piloto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
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
		
		
		bt1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				showDialog(0);
			}
		});
		
		//Motando a garde
		
		Grade gr = new Grade();
		String caminhoCadeiras = ".\\cadeira.txt";
		BufferedReader cadeiras;
		try {
			cadeiras = new BufferedReader(new InputStreamReader(new FileInputStream(caminhoCadeiras), "UTF-8"));
			String linha2;
			while ((linha2 = cadeiras.readLine()) != null){
				gr.addCadeira(new Cadeira(linha2));
			}

			cadeiras.close();
			
			
			String caminhoRequisitos = ".\\requisitos.txt";
			BufferedReader requisitos = new BufferedReader(new InputStreamReader(new FileInputStream(caminhoRequisitos), "UTF-8"));
		
			String linha3, cadeiraPrincipal;
			String[] auxRequisitos;
			while ((linha3 = requisitos.readLine()) != null){
				auxRequisitos = linha3.split("\t");
				cadeiraPrincipal = auxRequisitos[0];
				
				for (int i = 1; i < auxRequisitos.length; i++){
					gr.addPreRequisito(cadeiraPrincipal, auxRequisitos[i]);
				}
			}
			
			
			requisitos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
    protected Dialog onCreateDialog(int id) {
		switch (id) {
        case 0:

             //Primeiro precisamos criar um inflater que adapte o conteudo do xml para o AlertDialog
             LayoutInflater factory = LayoutInflater.from(this);
             final View textEntryView = factory.inflate(R.layout.opcoes, null); //passamos o XML criado
             return new AlertDialog.Builder(LesPilotoActivity.this)
                  .setTitle("O que deseja ???").setView(textEntryView)
                  .setPositiveButton("Cursando Disciplina", new DialogInterface.OnClickListener() {
                       public void onClick(DialogInterface dialog, int whichButton) {
                       	
                       	//ELE DEVER FAZER ALGUMA COISA Q EU NAO SEI OQ EH rsrsrs
                    	   dialog.cancel();
                  }
             }).setNegativeButton("Disciplina Cursada", new DialogInterface.OnClickListener() {
                  public void onClick(DialogInterface dialog, int whichButton) {
                	//ELE DEVER FAZER ALGUMA COISA Q EU NAO SEI OQ EH rsrsrs
               	  dialog.cancel();
                  }
             }).create(); //por fim criamos o AlertDialog depois de todo construído (título, layout, botões e ações)
		}
		return null;
	}

}
