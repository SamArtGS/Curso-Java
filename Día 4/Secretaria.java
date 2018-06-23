public class Secretaria extends Escolares{
	int sueldo;
	int sueldoProfesor;
	String tareasProfesor;
	String reporte;
	int hora;
	String recopilar;
	public Secretaria(String nombre, int edad, String genero, int sueldo, int sueldoProfesor, String tareasProfesor, String reporte,String recopilar, int hora){
		this.nombre=nombre;
		this.edad=edad;
		this.genero=genero;
		this.sueldo=sueldo;
		this.sueldoProfesor=sueldoProfesor;
		this.tareasProfesor=tareasProfesor;
		this.reporte=reporte;
		this.recopilar=recopilar;
		this.hora=hora;
	}
	@Override
	public void irEscuela(){
		if(hora<=8){
			System.out.println("La secretaria "+nombre+" checó hoy en la mañana temprano");

		}else{
			System.out.println("La secretaria llegó tarde y no pudo realizar las labores");
		}
	}
	public void recopilarSalario(){
		System.out.println("La secretaria "+nombre+" capturó el salario del profesor que fue: $"+sueldoProfesor);
	}
	@Override
	public void tarea(){
		System.out.println("La secretaria realizó las tareas de: "+tareasProfesor);
	}
	public void cobrar(){
		System.out.println("La secretaria "+nombre+" cobró $"+sueldo);
	}
	public void recopilarCalificaciones(){
		System.out.println("Recopiló las calificaciones de"+recopilar);
	}
	@Override
	public void clase(){
		if(hora<=8){
			System.out.println("La secretaria hizo el reporte de: "+reporte);
		}else{
			System.out.println("La secretaria no laboró");
		}
	}
}