public class Escuela{
	public static void main(String[] args) {
		Profesor profePoncho = new Profesor("Alfonso", 50, "masculino", 30000);
		Alumno juanito = new Alumno("Juan",11,"masculino",5);
		Alumno julia = new Alumno("Julio",11,"femenino",9.3);
		Alumno[] grupo = {juanito,julia};

		Secretaria lupita = new Secretaria("lupita",35,"femenino",5000,profePoncho.sueldo,"Matemáticas","Viernes 11","POO",7);

		profePoncho.irEscuela();
		juanito.irEscuela();
		julia.irEscuela();

		profePoncho.clase();
		juanito.clase();
		julia.clase();

		profePoncho.tarea();
		juanito.clase();
		julia.tarea();

		lupita.irEscuela();
		lupita.recopilarSalario();
		lupita.tarea();
		lupita.cobrar();
		lupita.recopilarCalificaciones();
		lupita.clase();

		for(Alumno alumno: grupo){ //Objeto, referencia, arreglo
			if(alumno.exento()){
				System.out.println(alumno.nombre+" exentó el examen");
			}else{
				System.out.println(alumno.nombre+" debe presentar final");
			}
		}

		profePoncho.cobrar();
	}
}