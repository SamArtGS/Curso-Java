import java.util.Scanner;
import java.util.InputMismatchException;

public class mainExcepciones{
	public static void main(String[] args) {
		double a,b,c;
		ComplejaExcepcion cp = new ComplejaExcepcion();
		boolean go=true;
		Scanner sc = new Scanner(System.in);

		while(go){

			try{

			System.out.println("Calculo de raices de polinomios");
			System.out.println("De la forma ax°2 + bx + c");
			System.out.println("¿Entrar?\n1.Si\n2.No\nR-->");
			if(sc.nextInt()==1){

				System.out.println("Valores de coeficientes");
				System.out.println("a-->");
				sc.nextLine();
				a=sc.nextDouble();
				System.out.println("b-->");
				sc.nextLine();
				b=sc.nextDouble();
				System.out.println("c-->");
				sc.nextLine();
				c=sc.nextDouble();

				Polinomio p = new Polinomio(a,b,c);
				System.out.println("Las raices del polinomio son: ");

				try{
					p.calRaiz();
				}catch(ComplejaException ce){
					System.out.println(""+ce.getMessage());
				}catch(NumberFormatException nfe){
					System.out.println("Numeros no validos");
				}
			}
			if(sc.nextInt()==2){
				System.out.println("Hasta luego");
				go=false;
			}
		}catch(InputMismatchException ime){
			System.out.println("Ingresa un numero, eso no lo es");
		}
	}
	}
}