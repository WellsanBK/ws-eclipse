import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class matematica_ws {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double area_tri, area_circ, area_trape, area_quad, area_ret, A, B, C;
		double pi = 3.14159;
		double raio;
		System.out.println("Digite o valor de A:  ");
		A = sc.nextDouble();
		System.out.println("Digite o valor de B:  ");
		B = sc.nextDouble();
		System.out.println("Digite o valor de C:  ");
		C = sc.nextDouble();

		area_tri = A * C / 2;

		System.out.printf("TRIANGULO: %.3f%n ", area_tri);

		raio = Math.pow(C, 2.00);
		area_circ = pi * raio;
		System.out.printf("CIRCULO: %.3f%n ", area_circ);

		area_trape = (A + B) / 2.0 * C;
		System.out.printf("TRAPEZIO: %.3f%n ", area_trape);

		area_quad = B * B;

		System.out.printf("QUADRADO: %.3f%n ", area_quad);

		area_ret = A * B;
		System.out.printf("RETANGULO:%.3f%n ", area_ret);

		sc.close();

	}

}