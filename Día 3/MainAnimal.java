public class MainAnimal{
	public static void main(String[] args) {
		System.out.println("");
		Rinoceronte R = new Rinoceronte(4, "negro","como vegetales","triste");
		Leon L = new Leon(4,"blanco","como top sirloin", 127);

		System.out.println("" +R.comer());
		System.out.println("" +L.comer());
		System.out.println("");
		R.datos();
		System.out.println("");
		L.datos();
		System.out.println("");
	}
}