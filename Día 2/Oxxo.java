public class Oxxo{
	public String dirección;
	public int numeroOxxo;
	private double dineroCaja;
	public static int contadorOxxos = 0;

	public Oxxo(String dirección){
		this.dirección = dirección;
		this.dineroCaja = 1000;
	  	contadorOxxos++;
	}
	public void modificarDinero(double dinero){
		this.dineroCaja = dinero;
	}
	public double getDinero(){
		return dineroCaja;
	}
	public String mostrarNumero(){
		return "Este es el oxoo número: " + numeroOxxo;
	}
	public static String contarOxxos(){
		return "Existen " +contadorOxxos+ " Oxxos";
	}
}