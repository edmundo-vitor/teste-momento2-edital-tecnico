import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Float[] values = new Float[3];
		
		//Recebe os valores
		takeInputValues(values);
	
		// Coloca os valores em ordem crescente
		sortASC(values);
		
		//Exibe os valores em ordem crescente
		System.out.println("Valores em ordem crescente");
		for(Float val: values) 
			System.out.println(val);
		
	}
	
	public static void takeInputValues(Float[] values) {
		Integer counter = 0;
		boolean rejected = true;
		
		Scanner scanner = new Scanner(System.in);
		
		// Laço para receber os três valores
		while(counter < values.length){
			
			// Laço para receber os valores e ficar repetindo caso o valor já tenha sido informado
			do {
				System.out.println("Informe o " + (counter+1) + "° valor:");
				Float buffer = scanner.nextFloat();
				
				// Verificação da existência dos valores
				if(buffer.equals(values[0]) || buffer.equals(values[1]) || buffer.equals(values[2])) {
					System.out.println("O valor já existe, informe outro valor!");
				}else {
					// Recebe o valor e modifica a variável de controle para sair do loop
					values[counter] = buffer;
					rejected = false;
				}
				
			} while(rejected);
			
			// Altera as variáveis de controle para seguir o fluxo
			counter++;
			rejected = true;	
		}
		
		scanner.close();
		
		
	}
	
	public static void sortASC(Float[] values) {
		float aux;
		
		for(int c = 0; c < values.length; c++) {
			
			for(int a = c + 1; a < values.length; a++) {
				if(values[a] < values[c]) {
					aux = values[c];
					values[c] = values[a];
					values[a] = aux;
				}
			}
		}
		
	}

}
