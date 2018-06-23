import java.util.Scanner;
public class Tablas{
	public static void main(String[] args) {
		int a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el número para mostrar su tabla de multiplicar: ");
	    a = sc.nextInt();
	    for(int i=1; i<=10; i++){
	    		System.out.println( + a + " x " + i + " = " + (i*a));
	    }
	    System.out.println("");
	}
}