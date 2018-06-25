import java.util.Scanner;
public class Simplificacion{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numerador=0, denominador=0;
		boolean go = true;

		while(go){

		System.out.println("Bienvenido a Simplifica mx");
		System.out.println("Quieres usar nuestro programa para simplificar tu fraccion?");
		System.out.println("\n1. Si\n2. No\n-->");
		int op = Integer.parseInt(sc.nextLine());

		if(op==1){

			try{
			System.out.println("Numerador: ");
			numerador=sc.nextInt();
			System.out.println("Denominador");
			denominador=sc.nextInt();

			int frac = numerador/denominador;
			int aux = Math.max(numerador, denominador);
			
			while(aux!=0){
				if(aux = 1 && ((numerador*numerador) == denominador)){
				denominador=denominador/numerador;
				numerador=numerador/numerador;
				System.out.println("Simplificacion: "+numerador+" / "+denominador);
				aux=0;
				}else if((numerador%aux) == 0 && ((denominador%aux == 0))){
					numerador=numerador/aux;
					denominador=denominador/auxiliar;
					System.out.println("Simplificacion: "+numerador+"/"+denominador);
				}
			}
			}catch(ArithmeticException ae){
				System.out.println("Valor incorrecto, ingresa de nuevo los valores");
			}catch(InputMismatchException ime){
				System.out.println("No estas ingresando un entero");
			else if(op==2){
				System.out.println("Fue un gusto atenderte. Adios");
				go=false;
			}

		}catch(InputMismatchException ime){
			System.out.println("No estas ingresando un entero");
		}
		}
	}
}	