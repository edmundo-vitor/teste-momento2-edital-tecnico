import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Float a, b, c, d, larger, smaller;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		a = scanner.nextFloat();
		
		System.out.println("Informe o valor de B: ");
		b = scanner.nextFloat();
		
		System.out.println("Informe o valor de C: ");
		c = scanner.nextFloat();
		
		System.out.println("Informe o valor de D: ");
		d = scanner.nextFloat();
		
		scanner.close();
		
		larger = a;
		smaller = a;
		
		//Maior valor
		if(b > larger)
			larger = b;
		
		if(c > larger)
			larger = c;
		
		if(d > larger)
			larger = d;
		
		//Menor valor
		if(b < smaller)
			smaller = b;
		
		if(c < smaller)
			smaller = c;
		
		if(d < smaller)
			smaller = d;
		
		
		System.out.println("Maior valor: " + larger);
		System.out.println("Menor valor: " + smaller);
	}

}
