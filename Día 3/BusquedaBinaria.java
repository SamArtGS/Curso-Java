import java.util.Arrays;
public class BusquedaBinaria{
	public static void main(String[] args) {
		int arreglo[]={4,2,5,4,6};
		String paises[]={"México","España","Italia"};
		Arrays.sort(paises);
		Arrays.sort(arreglo);
		int indice=Arrays.binarySearch(arreglo,2);
		int indice2=Arrays.binarySearch(paises,"México");
		imprimirArreglo(arreglo);
		imprimirArreglo1(paises);
		System.out.println("El número 2 está en la posición: " +(indice+1));
		System.out.println("México está en la posición: " +(indice2+1));
		
		String mismo[] = new String[10];
		imprimirArreglo1(mismo);
		Arrays.fill(mismo,"a");
		imprimirArreglo1(mismo); 
	}
	//métodos de instacia o clases de instancia
	//el tipo de dato a buscar debe ser el mismo que el arreglo
	public static void imprimirArreglo(int arreglo[]){
		for(int temp:arreglo){
			System.out.print(temp+" ");
		}
		System.out.println();
	}
	public static void imprimirArreglo1(String arreglo[]){
		for(String temp:arreglo){
			System.out.print(temp+" ");
		}
		System.out.println();
	}
}