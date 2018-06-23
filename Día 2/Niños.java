import java.util.Scanner;
public class Niños{
	public static void main(String[] args) {
	    int tiempo = 50;
		meses m = new meses();
		fibonacci k = new fibonacci();
		primo l = new primo();
		Scanner dr = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de niños que desea crear: ");
		int niños = dr.nextInt();
		for(int i=0; i<niños; i++){
			JuegosFeria niñito = new JuegosFeria("Niño");
			int desea = 1;
			while(desea==1){
			Scanner hd = new Scanner(System.in);
			System.out.println("Seleccione el juego que desea jugar: \n1.Primos\n2.Fibonacci\n3.Meses");
			int juego = hd.nextInt();
			switch(juego){
				case 1:
					tiempo = tiempo - m.mes();
					System.out.printf("Queda: %d\n", tiempo);
					System.out.println("¿Desea continuar en el jugando? 1:SI 2:NO");
					Scanner pl = new Scanner(System.in);
					desea = pl.nextInt();
				break;
				case 2:
					tiempo = tiempo - k.fibo();
					System.out.printf("Quedan: %d\n", tiempo);
					System.out.println("¿Desea continuar en el jugando? 1:SI 2:NO");
					Scanner ps = new Scanner(System.in);
					desea = ps.nextInt();
				break;
				case 3:
					tiempo = tiempo - l.prim();
					System.out.printf("Queda: %d\n", tiempo);
					System.out.println("¿Desea continuar en el jugando? 1:SI 2:NO");
					Scanner po = new Scanner(System.in);
					desea = po.nextInt();
				break;
				default:
				System.out.println("Ingrese una opción válida\n");
				System.out.println("¿Desea continuar en el jugando? 1:SI 2:NO");
					Scanner pu = new Scanner(System.in);
					desea = pu.nextInt();
				break;
			}

		}
	}
	}
}