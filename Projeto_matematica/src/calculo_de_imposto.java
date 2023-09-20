package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class calculo_de_imposto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
	
		
		double preco;
		double imposto;
		
		System.out.println("Digite o preço do produto:  ");
	    preco = sc.nextDouble();
		
	    if(preco <= 244.02 ) { 
		imposto = preco * 0.17;
		  System.out.printf("R$ %.2f%n", imposto);
	    }
	    else if(preco > 244.02) {
		 imposto = preco * 0.92;
		 System.out.printf("R$ %.2f%n", imposto);
		}
	    sc.close();
		}
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

