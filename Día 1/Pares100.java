import java.util.Scanner;
public class Pares100{
	public static void main(String[] args) {
		int opcion=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el número para mostrar los pares menores que éste: ");
	    opcion = sc.nextInt();
	    for(int i=0; i<=opcion; i++){
	    	if(i%2==0){
	    		System.out.println("%d ",i);
	    	}
	    }
	    System.out.println("");
	}
}