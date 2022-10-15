package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		System.out.println("Digite o primeiro número: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("A soma entre " + a + " e " + b + " é igual a: " + soma);
		System.out.println("A subtração entre " + a + " e " + b + " é igual a: " + subtracao);
		System.out.println("A multiplicação entre " + a + " e " + b + " é igual a: " + multiplicacao);
		System.out.println("A divisão entre " + a + " e " + b + " é igual a: " + divisao);
	}

	
	
	
	
	
	public static int soma(int a, int b) {
		return a + b;
		
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
		
	}
	
	public static double divisao(double a, double b) {
		return a / b;
		
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
		
	}
}
