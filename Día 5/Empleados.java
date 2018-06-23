public abstract class Empleados implements Asesor{
	private String nombre;
	private int edad;
	private int salario;
	private int nEmpleado;
	private static int contador;

	public Empleados(String nombre, int edad, int salario){
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		contador++;
		this.nEmpleado = contador;
	}

	public String getNombre(){
		return nombre;
	}
	public int getEdad(){
		return edad;
	}

	public int getSalario(){
		return salario;
	}
	public int getnEmpleado(){
		return nEmpleado;
	}
	public void aumentarSalario(int aumento){
	    this.salario +=aumento;
	}
	public abstract void trabajar();
	//Implementar los métodos de la interfaz
	@Override
	public void darAsesoría(int horas){
		System.out.println(nombre+" dice: \n Voy a dar: "+horas+" horas de asesoría");
		aumentarSalario(pago*horas);
	}
	@Override
	public void darSeguimiento(){
		System.out.println("El alumno va mejorando");
	}
}