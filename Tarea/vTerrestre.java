public class vTerrestre extends Vehiculo{
    public int ruedas=0;
	public String tracción="";
	public String modelo="";

	public vTerrestre(float velocidadMax, String color, String tipo, int ruedas, String tracción, String modelo){
		super(velocidadMax, color, tipo);
		this.ruedas=ruedas;
		this.tracción=tracción;
		this.modelo=modelo;
	}
	public void datos(){
		super.datos();
		System.out.println("Rudas: " +ruedas);
		System.out.println("Tracción: "+tracción);
		System.out.println("Modelo: " +modelo);
	}
	//Para la pila
	public Float getVelMax() {
        return velocidadmax;
    }
    public String getColor() {
        return color;
    }
    public String getTipo() {
        return tipo;
    }
    public int getRuedas(){
    	return ruedas;
    }
    public String getTraccion(){
    	return tracción;
    }
    public String getModelo(){
      return modelo;
    }
}
