package com.name.piloto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import android.os.Environment;

public class Grade {
	
	
	private HashSet<Cadeira> grade;  
	private List<String> disciplinasCursadas;
	private List<String> disciplinasEmCurso;
	
	
	public Grade(){
		this.grade = new HashSet<Cadeira>();
		this.disciplinasCursadas = new ArrayList<String>();
		this.disciplinasEmCurso = new ArrayList<String>();
	}
	
	public boolean addPreRequisito(Cadeira cadeira, Cadeira cadeiraRequisito){
		return cadeira.addPreRequisito(cadeiraRequisito);
	}
	
	public boolean addPreRequisito(String cadeira, String cadeiraRequisito){
		Cadeira cadeiraAux, cadeiraPrincipal = null, cadeiraSecundaria = null;
		Iterator<Cadeira> it = this.grade.iterator();
		
		while (it.hasNext()){
			cadeiraAux = it.next();
			if (cadeiraAux.getNomeCadeira().equals(cadeira)){
				cadeiraPrincipal = cadeiraAux;
			} 
			else if (cadeiraAux.getNomeCadeira().equals(cadeiraRequisito)){
				cadeiraSecundaria = cadeiraAux;
			}
		}
		return addPreRequisito(cadeiraPrincipal, cadeiraSecundaria);
	}
	
	public boolean realizarMatricula(String cadeira){
		Cadeira cadeiraAux;
		Iterator<Cadeira> it = this.grade.iterator();
		
		while (it.hasNext()){
			cadeiraAux = it.next();
			
			if (cadeiraAux.getNomeCadeira().equals(cadeira)){
				boolean auxBoolean = cadeiraAux.realizarMatricula();
				
				if (auxBoolean){
					this.disciplinasEmCurso.add(cadeira);
				}	
				return auxBoolean;
			}
			
		}
		
		return false;
	}
	
	@Override
	public String toString(){
		String res = null;
		Cadeira aux;
		Iterator<Cadeira> it = getGrade().iterator();
		
		while (it.hasNext()){
			aux = it.next();
			res = aux.getNomeCadeira() + " - " + aux.getPreRequisito() + " " + res;
		}
		
		return res;
	}
	
	
	public boolean pagarCadeira(String cadeira){
		Cadeira cadeiraAux;
		Iterator<Cadeira> it = getGrade().iterator();
		
		while (it.hasNext()){
			cadeiraAux = it.next();
			
			if (cadeiraAux.getNomeCadeira().equals(cadeira)){
				cadeiraAux.cadeiraCursada();
				if (cadeiraAux.isCursada()){
					this.disciplinasCursadas.add(cadeira);
				}
				return cadeiraAux.isCursada();
			}
			
		}
		
		return false;
	}
	
	public boolean addCadeira(Cadeira cadeira){
		return grade.add(cadeira);
	}
		
	public HashSet<Cadeira> getGrade() {
		return grade;
	}

	public static void main(String[] args) throws IOException, FileNotFoundException {
//		Grade gr = new Grade();
//		String caminhoCadeiras = ".\\cadeira.txt";
//		BufferedReader cadeiras = new BufferedReader(new InputStreamReader(new FileInputStream(caminhoCadeiras), "UTF-8"));
//		
//		String linha2;
//		while ((linha2 = cadeiras.readLine()) != null){
//			gr.addCadeira(new Cadeira(linha2));
//		}
//
//		cadeiras.close();
//		
//		
//		String caminhoRequisitos = ".\\requisitos.txt";
//		BufferedReader requisitos = new BufferedReader(new InputStreamReader(new FileInputStream(caminhoRequisitos), "UTF-8"));
//	
//		String linha3, cadeiraPrincipal;
//		String[] auxRequisitos;
//		while ((linha3 = requisitos.readLine()) != null){
//			auxRequisitos = linha3.split("\t");
//			cadeiraPrincipal = auxRequisitos[0];
//			
//			for (int i = 1; i < auxRequisitos.length; i++){
//				gr.addPreRequisito(cadeiraPrincipal, auxRequisitos[i]);
//			}
//		}
//		
//		
//		requisitos.close();
		
		
		
	}
	
	public List<String> disciplinasCursdas(){
		return this.disciplinasCursadas;
	}
	
	public List<String> disciplinasEmCurso(){
		return this.disciplinasEmCurso;
	}
	

	public String disciplinasEmCursoString(){
		String res = "";
		
		Iterator<String> it = disciplinasEmCurso.iterator();
		
		while (it.hasNext()){
			res = res + it.next() + "\n";
		}
		
		if (res == ""){
			return "Nao existe nenhuma cadeira matriculada";
		}
		
		return res;
		
	}
	
	public String disciplinasCursadasString(){
		String res = "";
		
		Iterator<String> it = disciplinasCursadas.iterator();
		
		while (it.hasNext()){
			res = res + it.next() + "\n";
		}
		
		if (res == ""){
			return "Nao existe nenhuma cadeira cursada";
		}
		
		return res;
		
	}

	public void mondaGrade()  {
		String caminhoCadeiras = Environment.getExternalStorageDirectory().getName() + File.separatorChar  + "cadeira.txt";
		BufferedReader cadeiras;
		try {
			cadeiras = new BufferedReader(new InputStreamReader(new FileInputStream(caminhoCadeiras), "UTF-8"));
			String linha2;
								
			while ((linha2 = cadeiras.readLine()) != null){
				addCadeira(new Cadeira(linha2));
			}
			

			cadeiras.close();
			
			
			String caminhoRequisitos = Environment.getExternalStorageDirectory().getName() + File.separatorChar  + "requisitos.txt";
			BufferedReader requisitos = new BufferedReader(new InputStreamReader(new FileInputStream(caminhoRequisitos), "UTF-8"));
		
			String linha3, cadeiraPrincipal;
			String[] auxRequisitos;

			while ((linha3 = requisitos.readLine()) != null){
				auxRequisitos = linha3.split("\t");
				cadeiraPrincipal = auxRequisitos[0];
				
				for (int i = 1; i < auxRequisitos.length; i++){
					addPreRequisito(cadeiraPrincipal, auxRequisitos[i]);
				}
			}
			
			
			requisitos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


