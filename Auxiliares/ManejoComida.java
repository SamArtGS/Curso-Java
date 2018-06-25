import java.util.Scanner;
public class Comida{
	public static void main(String[] args) {
		Scanneer sc =  new Scanner(System.in);
		String comida;
		do{
			System.out.println("Escribe el nombre de alguna comida o presiona s para salir");
			comida = sc.next();
			if(comida.equals("s"))
				break;
			try{
				revisarComida(comida);
			}catch(BuenaComidaException bce){
				System.out.println(bce.getMessage());
				bce.getMessage();
			}
		}while(!comida.equals("s"));
		System.out.println("Adios");
	}
	public static void revisarComida(String comida) throws BuenaComidaException{
		if(comida.equalsIgnoreCase("brocoli") || comida.equalsIgnoreCase("espincas"))
			throw new BuenaComidaException();
		else
			System.out.println("Yumi yumi\n");
	}
		
}