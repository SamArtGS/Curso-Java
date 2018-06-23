public class Test{
	public static void main(String[] args) {
		ControlRemoto control1 = new ControlRemoto(new Bomba(), new Bomba(), new Foco(), new Foco(),new Garage(), new Garage());
		control1.oprimirBoton1();
		control1.oprimirBoton2();
		control1.oprimirBoton3();
		control1.oprimirBoton4();
		control1.oprimirBoton5();
		control1.oprimirBoton6();
	}
}
	
