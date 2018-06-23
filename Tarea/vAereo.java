public class vAereo extends Vehiculo{
	public int ruedas=0;
	public int turbinas=0;
	public String clase="";

	public vAereo(float velocidad_max, String color, String tipo, int ruedas, int turbinas, String clase){
		super(velocidad_max, color, tipo);
		this.ruedas=ruedas;
		this.turbinas=turbinas;
		this.clase=clase;
	}

	public void datos(){
		super.datos();
		System.out.println("Ruedas: "+ruedas);
		System.out.println(("Turbinas: "+turbinas));
		System.out.println(("Clase: "+clase));
	}
	//PARA LA PILA :(
	public Float getVelMax() {
        return velocidadmax;
    }
    public String getColor() {
        return color;
    }
    public String getTipo() {
        return tipo;
    }

}