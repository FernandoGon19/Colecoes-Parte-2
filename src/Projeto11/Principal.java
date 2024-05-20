package Projeto11;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int quantidade;

	    ArrayList<String> listaMasculino = new ArrayList<String>();
	    ArrayList<String> listaFeminino = new ArrayList<String>();
		
		System.out.print("Quantas pessoas deseja cadastrar no sistema: ");
		Scanner teclado  = new Scanner(System.in);
		quantidade = teclado.nextInt();
		
		System.out.println("--------------------");

		for(int i = 1; i <= quantidade; i++) {
			String nome;
			String sexo;
			
			System.out.print("Nome: ");
			Scanner tecladoNome = new Scanner(System.in);
			nome = tecladoNome.next();
			
			System.out.print("Sexo: ");
			Scanner tecladoSexo = new Scanner(System.in);
			sexo = tecladoSexo.next();
			
			System.out.println("--------------------");
			
			if(sexo.equalsIgnoreCase("m")) {
				listaMasculino.add(nome);
			} else if (sexo.equalsIgnoreCase("f")) {
				listaFeminino.add(nome);
			}
			
		}
		
		System.out.println("Lista Masculina: " + listaMasculino);
		System.out.println("Lista Feminina: " + listaFeminino);
	}

}
