import java.util.Arrays;
public class Arreglos2{
	public static void main(String[] args){
		int arreglo1[]={1,3,4,5};
		int arreglo2[]=(int[])arreglo1.clone();
		System.out.println("Arreglo 1: ");
		imprimirArreglo(arreglo1);
		System.out.println("Arreglo 2: ");
		imprimirArreglo(arreglo2);
		arreglo2[2]=10;
		System.out.println("Arreglo 1: ");
		imprimirArreglo(arreglo1);
		System.out.println("Arreglo 2: ");
		imprimirArreglo(arreglo2);

	}
	public static void imprimirArreglo(int arreglo[]){
		for(int temp:arreglo){
			System.out.print(temp+" ");
		}
		System.out.println();
	}
}