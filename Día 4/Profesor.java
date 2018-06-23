public class Profesor extends Escolares{
	int sueldo;
	public Profesor(String nombre, int edad, String genero, int sueldo){
		this.nombre=nombre;
		this.edad=edad;
		this.genero=genero;
		this.sueldo=sueldo;
	}
	@Override
	public void irEscuela(){
		System.out.println("El profesor "+nombre+" llegó puntual a la escuela");
	}
	@Override
	public void clase(){
		System.out.println("El profesor "+nombre+" está preparando su clase");
	}

	@Override
	public void tarea(){
		System.out.println("El profesor "+nombre+" está preparando la tarea");
	}
	public void cobrar(){
		System.out.println("El profesor "+nombre+" cobró $"+sueldo);
	}
}