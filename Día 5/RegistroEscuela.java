import java.util.Scanner;
import java.util.ArrayList;
//import java.util."" traerte TODO
//TODO OBJETO EN JAVA TIENE POLIMORFISMO
public class RegistroEscuela{
		static Scanner sc = new Scanner(System.in);
		static String nombreAux;
		static int edadAux;
		static int salarioAux;
		static String infoExtra;

		public static void main(String[] args) {
			ArrayList<Empleados> registro = new ArrayList<Empleados>();
			int opcion;
			int nEmp;
			int horas;
			boolean bandera = true;

			System.out.println("\n Registro de personal: ");

			do{
				System.out.println("Registrar: \n1.Coordinador\n2.Maestro");
				opcion = sc.nextInt();
				sc.nextLine();//limpiar el capturador
				if(opcion==1){
					pedirDatos();
					System.out.println("\nArea");
					infoExtra = sc.nextLine();
					registro.add(new Coordinador(nombreAux,edadAux,salarioAux,infoExtra));
				}else if(opcion==2){
					pedirDatos();
					System.out.println("\nMateria: ");
					infoExtra = sc.nextLine();
					registro.add(new Maestro(nombreAux,edadAux,salarioAux,infoExtra));
				}
				System.out.println("\nQuieres registrar más? 1)SI 2)NO");
				opcion = sc.nextInt();
				sc.nextLine();
				if(opcion==2){
					bandera = false;
				}
			}while(bandera);
			
			System.out.println("Empleados ya registrados: ");
			for(Empleados emp:registro){
				System.out.println(emp.toString());
			}
			System.out.println("empelados que están trabajando: ");
			for(Empleados emp : registro){
				emp.trabajar();
			}
			System.out.println("Ingrese el número de empleado que quiere que le de la asesoría: ");
			nEmp=sc.nextInt();
			sc.nextLine();
			System.out.println("¿Cuántas horas de asesoría se impartirán? ");
			horas = sc.nextInt();
			sc.nextLine();
			registro.get((nEmp-1)).darAsesoría(horas);

			System.out.println("Desempeño del alumno en las asesorías: ");
			registro.get((nEmp-1)).darSeguimiento();
			System.out.println(registro.get((nEmp-1)).toString());
			}

			public static void pedirDatos(){
				System.out.println("\nNombre: ");
				nombreAux=sc.nextLine();
				System.out.println("\nEdad: ");
				edadAux=sc.nextInt();
				sc.nextLine();
				System.out.println("Salarios: ");
				salarioAux = sc.nextInt();
				sc.nextLine();
			}
	}