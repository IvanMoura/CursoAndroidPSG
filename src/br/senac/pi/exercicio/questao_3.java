package br.senac.pi.exercicio;

import java.util.Scanner;

public class questao_3 {

	public static void main(String[] args) {
		
		String nome;
		double nota1,nota2,nota3,nota4,media;

		Scanner c = new Scanner(System.in);
		
		System.out.println("Nome do aluno: ");
		nome=c.next();
		
		System.out.println("primeira nota: ");
		nota1=c.nextDouble();
		
		System.out.println("segunda nota: ");
		nota2=c.nextDouble();
		
		System.out.println("terceira nota: ");
		nota3=c.nextDouble();
		
		System.out.println("quarta nota: ");
		nota4=c.nextDouble();
		
		 media = (nota1+nota2+nota3+nota4)/4;	
		
		
		if(media>=7){
			System.out.println("Aluno "+nome+" está Aprovado");
		}else if(media>=6 && media<7){
			System.out.println("Aluno "+nome+" está de Recuperação");
			
		}else if(media<6){
			System.out.println("Aluno "+nome+" está Reprovado");
			
			
		}
		
		
		
			
			
		
		
		
		
		

	}

}
