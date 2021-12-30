import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Integer n;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		n = scanner.nextInt();
		
		scanner.close();
		
		// Exibe se é par ou impar
		if(isPair(n)) {
			System.out.println("O número é par!");
		}else {
			System.out.println("O número é impar!");
		}
		
		// Exibe se é positivo, negativo ou neutro
		Boolean result = isPositive(n);
		if(null != result) {
			if(result) {
				System.out.println("O número é positivo!");
			}else {
				System.out.println("O número é negativo!");
			}
		}else {
			System.out.println("O número é neutro!");
		}
		
		
	}
	
	public static Boolean isPair(Integer n) {
		if(n % 2 == 0)
			return true;
		return false;
	}

	public static Boolean isPositive(Integer n) {
		if(n > 0) {
			return true;
		}else if (n < 0) {
			return false;
		}else {
			return null;
		}
	}
}
