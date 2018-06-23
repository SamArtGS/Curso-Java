import java.util.Scanner;
public class Calculadora{
	public static void main(String[] args) {
		int a = 0;
	    int b = 0;
	    int resultado = 0;
	    int opcion = 0;
		//El ln imprime un salto de línea al final, el normal no, el f imprime una serie de funciones
		Scanner sc = new Scanner(System.in);
		  System.out.println("Elija una opción: \n1.-Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Modulo\n6.Salir");
	      opcion = sc.nextInt();
	      System.out.println("Opción selecionada: " + opcion);
	      switch(opcion){
	    	case 1:
	    	    Scanner cc = new Scanner(System.in);
	    	    a = cc.nextInt();
	    	    Scanner cd = new Scanner(System.in);
	    	    b = cd.nextInt();
	    	    resultado = a+b;
	    		System.out.println(a+ " + " +b+ " = " + resultado);
	    	break;
	    	case 2:
	    		Scanner cr = new Scanner(System.in);
	    	    a = cr.nextInt();
	    	    Scanner ca = new Scanner(System.in);
	    	    b = ca.nextInt();
	    	    resultado = a-b;
	    		System.out.println(a+ " - " + b + " = " + resultado);
	    	break;
	    	case 3:
	    		Scanner cf = new Scanner(System.in);
	    	    a = cf.nextInt();
	    	    Scanner cw = new Scanner(System.in);
	    	    b = cw.nextInt();
	    	    resultado = a*b;
	    		System.out.println(a+ " * " + b + " = " + resultado);
	    	break;
	    	case 4:
	    		Scanner cñ = new Scanner(System.in);
	    	    a = cñ.nextInt();
	    	    Scanner ck = new Scanner(System.in);
	    	    b = ck.nextInt();
	    	    float resultado1 = a/b;
	    		System.out.println(a+ " / " + b + " = " + resultado1);
	    	break;
	    	case 5:
	    		Scanner ct = new Scanner(System.in);
	    	    a = ct.nextInt();
	    	    Scanner cq = new Scanner(System.in);
	    	    b = cq.nextInt();
	    	    resultado = a%b;
	    		System.out.println(a+ " % " + b + " = " + resultado);
	    	break;
	    	case 6:
	    		System.exit(0);
	    	break;
	    	default:
	    		System.out.println("Ingrese una opción válida");
		    break;
		}
	}
}