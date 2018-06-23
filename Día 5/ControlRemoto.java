public class ControlRemoto{
	public Encendibles e1;
	public Apagables a1;
	public Encendibles e2;
	public Apagables a2;
	public Encendibles e3;
	public Apagables a3;

	public ControlRemoto(Encendibles e1, Apagables a1, Encendibles e2, Apagables a2, Encendibles e3, Apagables a3){
		this.e1=e1;
		this.a1=a1;	
		this.e2=e2;
		this.a2=a2;
		this.e3=e3;
		this.a3=a3;
	}
	public void oprimirBoton1(){
		e1.encender();
	}
	public void oprimirBoton2(){
		a1.apagar();
	}
	public void oprimirBoton3(){
		e2.encender();
	}
	public void oprimirBoton4(){
		a2.apagar();
	}
	public void oprimirBoton5(){
		e3.encender();
	}
	public void oprimirBoton6(){
		a3.apagar();
	}
	}