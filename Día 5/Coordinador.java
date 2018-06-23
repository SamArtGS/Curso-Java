public class Coordinador extends Empleados{
	private String area;
	public Coordinador(String nombre, int edad, int salario, String area){
		//Si se pone el constructor de la clase padre desde la primera línea
		super(nombre, edad, salario);
		this.area=area;
	}
	@Override
	public void trabajar(){
		System.out.println(getNombre()+" dice: Estoy coordinando.");
	}
	@Override
	public String toString(){
		return "Coordinador\nNombre: "+getNombre()+"\nEdad: "+getEdad()+"\nSalario: "+getSalario()+"\nÁrea de Coordinación: "+this.area+"\nNúmero de Empleado: "+getnEmpleado();
	} 
}