public class Garage implements Encendibles, Apagables{
	@Override
	public void encender(){
		System.out.println("La cochera ha sido abierta");
	}
	@Override
	public void apagar(){
		System.out.println("La cochera se cerró");
	}
}