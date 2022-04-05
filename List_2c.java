package List_2;
import java.util.Arrays;
import java.util.Scanner;
public class List_2c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

			
				// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
				
				int[] numeros = new int[10];
				
				for(int i=0; i<numeros.length; i++) {
						System.out.println("Insira os números: ");
						numeros[i] = ler.nextInt();
				}
				
				Arrays.sort(numeros);

		        System.out.println("Esses sao os números ordenados:");
		        for(int numero : numeros)
		            System.out.println(numero);

			}

		}
