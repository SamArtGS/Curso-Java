import java.util.Scanner;
import java.util.InputMismatchException;
public class DivisionCero{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int resultado = 0;
			boolean continuar = True;
		
		do{
			try{
				System.out.println("Ingresa el numerador: ");
				int numerador = sc.nextInt();
				System.out.println("Ingrese el denominador:");
				int denominador = sc.nextInt();
				resultado = numerador/denominador;
				System.out.println("El resultado es: "+resultado);
			} catch(InputMistmatchException ime){
				System.out.println("El resultado es: "+resultado);
				ime.printStackTrace();
				sc.nextLine();
			} catch(ArithmeticException ae){
				System.out.println("Acabas de realizar la division entre cero");
				ae.printStackTrace();
			} //finally{ si se pone el finally marca error porque despues del ciclo ya no tiene que scanner que cerrar
				//sc.close();
			//}	
		}while(continuar);
	}
}