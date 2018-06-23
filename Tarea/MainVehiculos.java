import java.util.Scanner;
import java.util.Stack;
public class MainVehiculos{
	public static void main(String[] args) {
		int respuesta = 0;
		System.out.print("¿Quiere tirar su dinero de la beca comprando vehículos incesarios pero cools? (si:1, no:cualquier otro número): ");
		Scanner rg = new Scanner(System.in);
	    respuesta = rg.nextInt();
				if(respuesta==1){
					System.out.println("\tBienvenido a sus compras");
				}else{
					System.out.println("\tBye Bye :)");
					System.exit(0);
				}
		Stack<vTerrestre> pila = new Stack<vTerrestre>();
		Stack<vAereo> pila1 = new Stack<vAereo>();
		Stack<vAcuatico> pila2 = new Stack<vAcuatico>();

		System.out.println("\n----------------------------------------");
		System.out.println("\tAGENCIA DE VEHÍCULOS ONLINE");
		System.out.println("----------------------------------------");
		System.out.println("Ingrese la ");
		int opcion=0;

		Float velocidadMax;
		String color="";
		String tipo="";
		int ruedas = 0;
		String tracción ="";
		String modelo = "";

		do{
          Scanner sc = new Scanner(System.in);
          System.out.println("\n\tElija una opción: \n\t\t1.-Comprar un vehículo terrestre\n\t\t2.Comprar un vehículo aereo\n\t\t3.Comprar un vehículo acuático\n\t\t4.Mostrar los vehículos comprados\n\t\t5.Salir");
	      System.out.print("\t:");
	      opcion = sc.nextInt();
	      System.out.println("\tOpción selecionada: " + opcion);
	      switch(opcion){
	    	case 1:
	    		System.out.println("\tIngrese las características del vehículo: ");
	    		System.out.print("\tVelocidad Máxima: ");
	    		Scanner sq = new Scanner(System.in);
	    		 velocidadMax = sq.nextFloat();
	    		System.out.print("\tColor: ");
	    		Scanner po = new Scanner(System.in);
	    		 color = po.next();
	    		System.out.print("\tTipo: ");
	    		Scanner pu = new Scanner(System.in);
	    		 tipo = pu.next();
	    		System.out.print("\tRuedas: ");
	    		Scanner pa = new Scanner(System.in);
	    		 ruedas = pa.nextInt();
	    		System.out.print("\tTracción: ");
	    		Scanner pe = new Scanner(System.in);
	    		 tracción = pe.next();
	    		System.out.print("\tModelo: ");
	    		Scanner pui = new Scanner(System.in);
	    		 modelo = pui.next();
	    		vTerrestre vehicle = new vTerrestre(velocidadMax,color,tipo,ruedas,tracción,modelo);
	    		pila.push(vehicle);
	    		System.out.println("");
	    		vehicle.datos();
	    		System.out.println("");
	    	break;
	    	case 2:
	    		System.out.println("\tIngrese las características del vehículo: ");
	    		System.out.print("\tVelocidad Máxima: ");
	    		Scanner ab = new Scanner(System.in);
	    		 velocidadMax = ab.nextFloat();
	    		System.out.print("\tColor: ");
	    		Scanner bc = new Scanner(System.in);
	    		 color = bc.next();
	    		System.out.print("\tTipo: ");
	    		Scanner cd = new Scanner(System.in);
	    		 tipo = cd.next();
	    		System.out.print("\tRuedas: ");
	    		Scanner de = new Scanner(System.in);
	    		 ruedas = de.nextInt();
	    		System.out.print("\tTurbinas: ");
	    		Scanner ef = new Scanner(System.in);
	    		int turbinas = ef.nextInt();
	    		System.out.print("\tClase: ");
	    		Scanner gh = new Scanner(System.in);
	    		String clase = gh.next();
	    		vAereo aero = new vAereo(velocidadMax,color,tipo,ruedas,turbinas,clase);
				pila1.push(aero);
				System.out.println("");
				aero.datos();
				System.out.println("");
			break;
	    	case 3:
	    		System.out.println("\tIngrese las características del vehículo: ");
	    		System.out.print("\tVelocidad Máxima: ");
	    		Scanner ij = new Scanner(System.in);
	    		 velocidadMax = ij.nextFloat();
	    		System.out.print("\tColor: ");
	    		Scanner kl = new Scanner(System.in);
	    		 color = kl.next();
	    		System.out.print("\tTipo: ");
	    		Scanner mn = new Scanner(System.in);
	    		 tipo = mn.next();
	    		System.out.print("\tCapitán: ");
	    		Scanner mo = new Scanner(System.in);
	    		String capitan = mo.next();
	    		System.out.print("\tNúmero de Pasajeros: ");
	    		Scanner mq = new Scanner(System.in);
	    		int numPasajeros = mq.nextInt();
	    		String nombrePasajeros[];
	    		int numBoleto[];

				  nombrePasajeros = new String[numPasajeros];
				  numBoleto = new int[numPasajeros];

	    		vAcuatico bottle = new vAcuatico(velocidadMax,color,tipo,capitan,numPasajeros,nombrePasajeros,numBoleto);
	    		pila2.push(bottle);
	    		System.out.println("");
	    		bottle.datos();
	    		System.out.println("");
	    	break;
	    	case 4:
	    	System.out.println("\tLos vehículos comprados son: ");
	    	System.out.println("\n---------------------------------------------");
	    	System.out.println("\tBARCOS:");
	    	while (!pila2.isEmpty()) {
            System.out.println(pila2.pop().getVelMax());
            System.out.println(pila2.pop().getColor());
            System.out.println(pila2.pop().getTipo());
            System.out.println(pila2.pop().getPiscina());
            System.out.println(pila2.pop().getSalaMaquinas());
            System.out.println(pila2.pop().getCapitan());
            System.out.println(pila2.pop().getNumPasajeros());
       		/*System.out.println(pila2.pop().getNombresPasajerosyNum());*/
       		}
       		System.out.println("\n---------------------------------------------");
	        System.out.println("\n---------------------------------------------");
	    	System.out.println("\tTerestres:");
	    	while (!pila2.isEmpty()) {
            System.out.println(pila2.pop().getVelMax());
            System.out.println(pila2.pop().getColor());
            System.out.println(pila2.pop().getTipo());
            System.out.println(pila2.pop().getPiscina());
            System.out.println(pila2.pop().getSalaMaquinas());
            System.out.println(pila2.pop().getCapitan());
            System.out.println(pila2.pop().getNumPasajeros());
       		/*System.out.println(pila2.pop().getNombresPasajerosyNum());*/
       		}
       		System.out.println("\n---------------------------------------------");
					//Los vehículos terrestres son categorizados dentro
					while (!pila.isEmpty()) {
						System.out.println(pila.pop().getVelMax());
						System.out.println(pila.pop().getColor());
						System.out.println(pila.pop().getTipo());
						System.out.println(pila.pop().getRuedas());
						System.out.println(pila.pop().getTraccion());
						System.out.println(pila.pop().getModelo());
					}
						System.out.println("\n---------------------------------------------");
					while (!pila1.isEmpty()) {
						System.out.println(pila1.pop().getVelMax());
						System.out.println(pila1.pop().getColor());
						System.out.println(pila1.pop().getTipo());
						System.out.println(pila1.pop().);
					}
	    	break;
	    	case 5:
			System.exit(0);
	    	break;
	    	default:
	    	System.out.println("Ingrese una opción válida");
	    	break;
		}
	}while(opcion!=6);
}}
