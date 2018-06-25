import java.util.Scanner;
public class MetodoExcepcion{
	public void lanzarExcepcion() throws MiExcepcion{
		Scannner sc = new Scanner(System.in);
		System.out.println("Presiona 1 para lanzar la excepcion");
		int i = sc.next();
		if(i == "")// se pone sin llaves porque solo ejecutara una line, tambien sirve con el for
			throw new MiExcepcion();

	}
}