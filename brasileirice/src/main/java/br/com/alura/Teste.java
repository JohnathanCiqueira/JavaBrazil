package br.com.alura;

public class Teste {
	
	public static void main(String[] args) {
	
		int a = 2;
		int b = 4;
		int c = 0;
		int d = 0;
		int i = 0;
		
		c = a * b + i++;
		d = a * b + ++i;
		System.out.println(c);
		System.out.println(d);
		
	}
}

