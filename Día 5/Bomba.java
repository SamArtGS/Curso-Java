public class Bomba implements Apagables, Encendibles{
	@Override
	public void encender(){
		System.out.println("Llenando el tinaco...");
	}
	@Override
	public void apagar(){
		System.out.println("Bomba apagada.");
	}

}