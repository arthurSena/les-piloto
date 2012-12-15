package com.name.piloto;

import java.util.HashSet;
import java.util.Iterator;

public class Cadeira {
	
	
	private boolean cursada;
	private boolean emCurso;
	private HashSet<Cadeira> preRequisito;
	private String nomeCadeira;
	
	public Cadeira(String nomeCadeira) {
		this.nomeCadeira = nomeCadeira;
		this.cursada = false;
		this.emCurso = false;
		this.preRequisito = new HashSet<Cadeira>();
	}
	
	//Quando quiser notificar que a cadeira esta em curso
	public boolean realizarMatricula(){
		HashSet<Cadeira> aux = getPreRequisito();
		Iterator<Cadeira> it  = aux.iterator();
		
		while (it.hasNext()){
			if (!it.next().isCursada()){
				return false;
			}
		}
		setEmCurso(true);
		
		
		return true;
	}
	
	public boolean addPreRequisito(Cadeira novaCadeira){
		return getPreRequisito().add(novaCadeira);
	}

	public boolean isCursada() {
		return cursada;
	}

	//Quando quiser macar que uma cadeira foi paga, utilizar esse metodo
	public boolean cadeiraCursada() {
		HashSet<Cadeira> aux = getPreRequisito();
		Iterator<Cadeira> it  = aux.iterator();
		
		while (it.hasNext()){
			if (!it.next().isCursada()){
				return false;
			}
		}
		
		setCursada(true);
		return true;
	}
	
	public void setCursada(boolean cursada) {
		this.cursada = cursada;
	}

	public HashSet<Cadeira> getPreRequisito() {
		return preRequisito;
	}

	public void setPreRequisito(HashSet<Cadeira> preRequisito) {
		this.preRequisito = preRequisito;
	}

	public String getNomeCadeira() {
		return nomeCadeira;
	}

	public void setNomeCadeira(String nomeCadeira) {
		this.nomeCadeira = nomeCadeira;
	}
	
	
	public boolean isEmCurso() {
		return emCurso;
	}

	public void setEmCurso(boolean emCurso) {
		this.emCurso = emCurso;
	}

	@Override
	public String toString(){
		return getNomeCadeira();
	}	

}
