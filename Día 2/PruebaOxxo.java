import java.util.Scanner;
public class PruebaOxxo{
	public static void main(String[] args) {
		Oxxo sucursal1 = new Oxxo("Copilco 1200");
		Oxxo sucursal2 = new Oxxo("Centenario 987");

		System.out.println(Oxxo.contarOxxos());
		System.out.println("Dinero en el Oxxo 1: " + sucursal1.getDinero());

		sucursal1.modificarDinero(5000);

		System.out.println("Dinero en el Oxxo 1: " + sucursal1.getDinero());

		System.out.println(sucursal2.mostrarNumero());

		Oxxo sucursal3 = new Oxxo("Av. Universidad 456");

		System.out.println("Av. Universidad 456");

		System.out.println(Oxxo.contarOxxos());

		1
	}
}