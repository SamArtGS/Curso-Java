public class Vehiculo{
	public float velocidadmax=0;
	public String color;
	public String tipo;
	public boolean estado=false;

	public Vehiculo(){

	}

	public Vehiculo(float velocidadmax, String color, String tipo){
		this.velocidadmax=velocidadmax;
		this.color=color;
		this.tipo=tipo;
		
	}

	public void encender(){
		estado=true;
	}

	public String encendido(){
		if(estado){
			return "Esta encendido";
		}
		else
			return "Esta apagado";

	}

	public void datos(){
		System.out.println("\tVel. Max: "+velocidadmax);
		System.out.println("\tColor: "+color);
		System.out.println("\tTipo de vehiculo: "+tipo);
	}
}