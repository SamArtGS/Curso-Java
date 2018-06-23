import java.util.Scanner;
public class EstructurasDeControl{

    public static void main(String[] args) {

	    Scanner scannner = new Scanner(System.in);
	    
	    String opcion = "Hola";
	    int numero = 0;

	    System.out.println("Ingresa un número: ");
	    numero = scannner.nextInt();
	    for(int i = 0; i<numero; i++){
	    	System.out.println(opcion);
	    }
	    while(opcion.equals("Hola")){
	    	System.out.print("Dame otra opción: ");
	    	opcion = scannner.next();
	    }
	    switch(opcion){
	    	case "1":
	    		System.out.println("Fue 1");
	    	break;
	    	case "2":
	    		System.out.println("Fue 2");
	    	break;
	    	default:
	    		System.out.println("No sé que fue");
	    	break;
	    }
    }
}
