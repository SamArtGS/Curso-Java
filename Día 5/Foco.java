public class Foco implements Encendibles, Apagables{
	@Override
	public void encender(){
		System.out.println("Encendiendo las luces");
	}
	@Override
	public void apagar(){
		System.out.println("Luces fuera");
	}
}