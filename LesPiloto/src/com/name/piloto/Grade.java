package com.name.piloto;

public class Grade {
	
	private  String[] periodo1 = {"Calculo 1" , "Itr. Comp" , "LPT" , "LP1" , "P1" , "Vetorial"};
	private  String[] periodo2 = {"Calculo 2" , "Programacao 2 " , "Discreta" , "LP2" , "P2" , "Grafos","Fisica Classica"};
	private  String[] periodo3 = {"EDA" , "LEDA" , "Alg. Linear" , "Probabilidade" , "Teoria Comp." , "Fisica Moderna", "Gerencia Inf."};
	private  String[] periodo4 = {"Logica Matematica" , "SI 1" , "Engenharia de Soft." , "Metodos Estatisticos" , "PLP" , "OAC", "LOAC"};
	private  String[] periodo5 = {"ATAL" , "Redes" , "Compiladores" , "BD1" , "SI 2" , "LES" , "Inf. Sociedade"};
	private  String[] periodo6 = {"SO" , "IRC" , "LIRC" , "IA" , "BD2" , "OPT 1" , "OPT 2" , "Direito"};
	private  String[] periodo7 = {"MSN" , "ADSD" , "Projeto 1" , "OPT 3" , "OPT 4" , "OPT 5", "OPT 6"};
	private  String[] periodo8 = {"Projeto 2" , "OPT 7" , "OPT 8" , "OPT 9" , "OPT 10" , "OPT 11"};
	
	public Grade(){}
	
	public String[] getDisciplinas(int periodo){
		if (periodo == 1) {
			return periodo1;
		}
		else if (periodo == 2) {
			return periodo2;
		}
		else if (periodo == 3) {
			return periodo3;
		}
		else if (periodo == 4) {
			return periodo4;
		}
		else if (periodo == 5) {
			return periodo5;
		}
		else if (periodo == 6) { 
			return periodo6;
		}
		else if (periodo == 7) {
			return periodo7;
		}
		else if (periodo == 8) {
			return periodo8;
		}
		else{
			return null;
		}
	}
}


