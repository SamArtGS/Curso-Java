import java.util.Scanner;
public class Usuario{
	public static void main(String[] args) {
	int arreglo[] = new int[10];
	System.out.println("Ingrese 10 números para mostarlos en un arreglo: ");
	int i=0;
	for(i=0; i<10; i++){
		System.out.printf("Número %d:",(i+1));
		Scanner sc = new Scanner(System.in);
		arreglo[i] = sc.nextInt();
	}
	System.out.print("El arreglo es: ");
	imprimirArreglo(arreglo);
	System.out.print("El arreglo invertido es: ");
	imprimirArregloI(arreglo);
	}
	public static void imprimirArreglo(int arreglo[]){
		for(int temp:arreglo){
			System.out.print(temp+" ");
		}
		System.out.println();
	}
	public static void imprimirArregloI(int arreglo[]){
		int j=0;
		for(j=0;j<10;j++){
			System.out.printf("%d ",arreglo[9-j]);
		}
		System.out.println();
	}
}
