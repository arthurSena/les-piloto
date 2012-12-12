package com.name.piloto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class LesPilotoActivity extends Activity {

	private String periodoSelecionado;
	private String cadeiraSelecionada;
	HashMap<Integer, String> btCadeira = new HashMap<Integer, String>();
	HashMap<String, String> btPeriodo = new HashMap<String, String>();
	Grade gr = new Grade();
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
		String b;
		
		b = "aa";
		try {
			gr.mondaGrade();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//				String caminhoCadeiras = ".\\cadeira.txt";
//				BufferedReader cadeiras;
//				try {
//					cadeiras = new BufferedReader(new InputStreamReader(new FileInputStream(caminhoCadeiras), "UTF-8"));
//					String linha2;
//					while ((linha2 = cadeiras.readLine()) != null){
//						gr.addCadeira(new Cadeira(linha2));
//					}
//					b = "aa";
//
//					cadeiras.close();
//					
//					
//					String caminhoRequisitos = ".\\requisitos.txt";
//					BufferedReader requisitos = new BufferedReader(new InputStreamReader(new FileInputStream(caminhoRequisitos), "UTF-8"));
//				
//					String linha3, cadeiraPrincipal;
//					String[] auxRequisitos;
//					b = "aa";
//					while ((linha3 = requisitos.readLine()) != null){
//						auxRequisitos = linha3.split("\t");
//						cadeiraPrincipal = auxRequisitos[0];
//						
//						for (int i = 1; i < auxRequisitos.length; i++){
//							gr.addPreRequisito(cadeiraPrincipal, auxRequisitos[i]);
//						}
//					}
//					
//					
//					requisitos.close();
//
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bt1 = (ImageButton ) findViewById(R.main.imageButton1);
		btCadeira.put(bt1.getId(), "bt1");
		bt2 = (ImageButton ) findViewById(R.main.imageButton2);
		btCadeira.put(bt2.getId(), "bt2");
		bt3 = (ImageButton ) findViewById(R.main.imageButton3);
		btCadeira.put(bt3.getId(), "bt3");
		bt4 = (ImageButton ) findViewById(R.main.imageButton4);
		btCadeira.put(bt4.getId(), "bt4");
		bt5 = (ImageButton ) findViewById(R.main.imageButton5);
		btCadeira.put(bt5.getId(), "bt5");
		bt6 = (ImageButton ) findViewById(R.main.imageButton6);
		btCadeira.put(bt6.getId(), "bt6");
		bt7 = (ImageButton ) findViewById(R.main.imageButton7);
		btCadeira.put(bt7.getId(), "bt7");
		bt8 = (ImageButton ) findViewById(R.main.imageButton8);
		btCadeira.put(bt8.getId(), "bt8");
		
		registerForContextMenu(bt1);
		registerForContextMenu(bt2);
		registerForContextMenu(bt3);
		registerForContextMenu(bt4);
		registerForContextMenu(bt5);
		registerForContextMenu(bt6);
		registerForContextMenu(bt7);
		registerForContextMenu(bt8);
		
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
	    			btPeriodo.put("1º Periodo bt1", "Programacao I");
	    			bt2.setImageResource(R.drawable.labp1);
	    			btPeriodo.put("1º Periodo bt2", "Laboratorio de Programacao I");
	    			bt3.setImageResource(R.drawable.calculo1);
	    			btPeriodo.put("1º Periodo bt3", "Calculo Diferencial e Integral I");
	    			bt4.setImageResource(R.drawable.vetorial);
	    			btPeriodo.put("1º Periodo bt4", "Algebra Vetorial e Geometria Analitica");
	    			bt5.setImageResource(R.drawable.ic);
	    			btPeriodo.put("1º Periodo bt5", "Introducao a Computacao");
	    			bt6.setImageResource(R.drawable.lpt);
	    			btPeriodo.put("1º Periodo bt6", "Leitura e Producao de Textos");
	    			bt7.setVisibility(View.INVISIBLE);
	    			bt8.setVisibility(View.INVISIBLE);
	    		}
	    		else if (periodoSelecionado.equalsIgnoreCase("2º Periodo")) {
	    			bt1.setImageResource(R.drawable.p2);
	    			btPeriodo.put("2º Periodo bt1", "Programacao II" );
	    			bt2.setImageResource(R.drawable.labp2);
	    			btPeriodo.put("2º Periodo bt2", "Laboratorio de Programacao II");
	    			bt3.setImageResource(R.drawable.calculo2);
	    			btPeriodo.put("2º Periodo bt3", "Calculo Diferencial e Integral II");
	    			bt4.setImageResource(R.drawable.grafos);
	    			btPeriodo.put("2º Periodo bt4", "Teoria dos Grafos");
	    			bt5.setImageResource(R.drawable.discreta);
	    			btPeriodo.put("2º Periodo bt5", "Matematica Discreta");
	    			bt6.setImageResource(R.drawable.fisica3);
	    			btPeriodo.put("2º Periodo bt6", "Fundamentos de Fisica Classica");
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
	
	@Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
    	super.onCreateContextMenu(menu, v, menuInfo);
    	menu.setHeaderTitle("Status disciplina");
    	if (v == bt1 || v == bt2 || v == bt3 || v == bt4 || v == bt5 ||
    			v == bt6 || v == bt7 || v == bt8 ) {
    		cadeiraSelecionada = btCadeira.get(v.getId());
    		MenuInflater inflater = getMenuInflater();
    		inflater.inflate(R.menu.status, menu);
    	}
    }
	
	@Override
	public String toString(){
		return "aaaaa";
	}
    
    @Override
    public boolean onContextItemSelected(MenuItem item) {
    	String ca = "s";
    	cadeiraSelecionada = btPeriodo.get(periodoSelecionado + " " + cadeiraSelecionada);
    	switch (item.getItemId()) {
    	
    		case R.id.cursada:
    			ca = gr.toString();
    			if (gr.pagarCadeira(cadeiraSelecionada)){
        			Toast.makeText(getApplicationContext(), cadeiraSelecionada +  " Marcada como cursada " , Toast.LENGTH_SHORT).show();
    			}
    			else {
    				Toast.makeText(getApplicationContext(), cadeiraSelecionada + "Nao foi possivel marcar como cursada", Toast.LENGTH_SHORT).show();
    			}
    			return true;
    		case R.id.emCurso:
    			if (gr.realizarMatricula(cadeiraSelecionada)){
        			Toast.makeText(getApplicationContext(), cadeiraSelecionada + "Marcada como em Curso", Toast.LENGTH_SHORT).show();
    			} 
    			else {
        			Toast.makeText(getApplicationContext(), cadeiraSelecionada +  "Nao foi possivel marcar como em curso", Toast.LENGTH_SHORT).show();
    			}
    			return true;
    		case R.id.naoCursada:
    			Toast.makeText(getApplicationContext(), "Marcada como Não Cursada", Toast.LENGTH_SHORT).show();
    			return true;
    		default:
    			return super.onContextItemSelected(item);
    	}
    }
}
