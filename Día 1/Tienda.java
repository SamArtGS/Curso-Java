public class Tienda{
	public int numAnaqueles = 5;
	private float dinero = 1000;
	public String articulo1 = "Papitas";
	public String articulo2 = "Coca";
	public String nombre = "";
	public String persona1 = "";

	public Tienda(String nombre){
		//java maneja un operador this que hace referencia a la variable en curso
		this.nombre = nombre;
		System.out.println("Se creó la tienda " + nombre);
	}
	public void vender(){
		
		if (!articulo1.equals("")){
			System.out.println("Se vendió el artículo: "+ articulo1);
		}
		else{
			System.out.println("No hay articulo1");
		}
	}
	public String contratar(String personaNueva){
		System.out.println("Se ha contratado a " + personaNueva);
		persona1 += personaNueva + ",";
		return persona1;
	}

	public static void main(String[] args) {
		
	}
}