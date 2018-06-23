public class Maestro extends Empleados{
	private String materia;

	public Maestro(String nombre, int edad, int salario, String materia){
		super(nombre, edad, salario);
		this.materia = materia;
	}

	@Override
	public void trabajar(){
		System.out.println(getNombre()+" dice: Estoy dando clase.");
	}

	public String toString(){
		return "\nMaestro\nNombre: "+getNombre()+"Edad: "+getEdad()+"\nSalario: "+getSalario()+" Materia: "+this.materia+"\nNúmero de empleado: "+getnEmpleado();
	}
}