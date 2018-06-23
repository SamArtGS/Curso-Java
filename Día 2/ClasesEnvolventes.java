public class ClasesEnvolventes{
	public static void main(String[] args) {
		double a;
		Double b = 3.5454;

		a = b; //Unboxing ya que se está desempaquetando a la variable
		// b es una clase envolvente y se destapa para asignarle a a

		int x=7;
		Integer y;

		y=x;

		System.out.println(y.toString());
		System.out.println(a);

	}
}