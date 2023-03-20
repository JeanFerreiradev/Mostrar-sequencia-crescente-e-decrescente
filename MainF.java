package trabalhoQuinta;

import java.util.Arrays;
import java.util.Scanner;

public class MainF {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");
            numeros[i] = console.nextInt();
        }

        Arrays.sort(numeros);
        System.out.printf("Numeros em ordem crescente: %s%n", Arrays.toString(numeros));

      
        for (int i = 0; i < 5; i++) {
            int temporaria = numeros[i];
            numeros[i] = numeros[10 - 1 - i];
            numeros[10 - 1 - i] = temporaria;
        }
        System.out.printf("Numeros em ordem decrescente: %s%n", Arrays.toString(numeros));
        
        console.close();
	}

}