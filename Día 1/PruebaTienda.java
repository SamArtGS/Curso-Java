public class PruebaTienda{
	public static void main(String[] args) {
		Tienda tiendita = new Tienda("Microsoft");
	    tiendita.vender();
	    tiendita.contratar("Bill");
	    System.out.println(tiendita.numAnaqueles);
	}
}
