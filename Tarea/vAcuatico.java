import java.util.Scanner;
public class vAcuatico extends Vehiculo{
	public String piscina = "";
	public String salaMaquinas = "";
	public String capitan="";
	public int numPasajeros=0;
	public String nombrePasajeros[];
	private int numBoleto[];
	private String tipeBoleto[];
	public vAcuatico(float velocidadMax, String color, String tipo, String capitan, int numPasajeros, String nombrePasajeros[],int numBoleto[]){
		super(velocidadMax, color, tipo);
		if(tipo=="Crucero"){
			piscina = "SI";
		}else{
			piscina = "NO";
		}
		if(tipo=="Barco"||tipo=="Crucero"){
			salaMaquinas="SI";
		}else{
			salaMaquinas="NO";
		}
		this.capitan=capitan;
		this.numPasajeros=numPasajeros;
		this.nombrePasajeros = new String[numPasajeros];
		this.numBoleto = new int[numPasajeros];
		for(int i=0;i<numPasajeros;i++){
				System.out.print("\t\tNombre del Pasajero "+(i+1)+" : ");
				Scanner as = new Scanner(System.in);
				 nombrePasajeros[i] = as.next();
				System.out.print("\t\tNúmero de boleto: ");
				Scanner ñm = new Scanner(System.in);
	    		 numBoleto[i] = ñm.nextInt();
				}
		tipeBoleto = new String[numPasajeros];
		for(int i=0;i<numPasajeros;i++){
		    if(numBoleto[i]>1000){
			    tipeBoleto[i]="Normal";
		    }else{
			    tipeBoleto[i]="VIP";
		    }
	}
	}
	public void datos(){
		super.datos();
		System.out.println("\tPiscina: "+piscina);
		System.out.println("\tSala de Máquinas: " +salaMaquinas);
		System.out.println("\tNombre del Capitán: " +capitan);
		System.out.println("\tNumero de Pasajeros: " +numPasajeros);
		for(int i=0;i<numPasajeros;i++){
			System.out.println("\t\tNombre del Pasajero "+i+" : "+(nombrePasajeros[i]));
			System.out.print("\t\tNúmero de boleto: "+(numBoleto[i]));
			System.out.print("\t\tTipo de boleto: "+(tipeBoleto[i]));
			System.out.println("");

	}
	}
	//Las devoluciones a la pila
	public Float getVelMax() {
        return velocidadmax;
    }
    public String getColor() {
        return "Barco color: "+color;
    }
    public String getTipo() {
        return "Barco de tipo: "+tipo;
    }
    public String getPiscina() {
        return "\t"+piscina+" hay piscina";
    }
    public String getSalaMaquinas() {
        return "\t"+salaMaquinas+" hay sala de Máquinas";
    }
    public String getCapitan() {
        return "\tEl capitán es: "+capitan;
    }
    public int getNumPasajeros() {
        return numPasajeros;
    }
    public String getNombresPasajerosyNum(int i){
    	return "\tPasajero: "+nombrePasajeros[i]+" con boleto: "+numBoleto[i]+" y tipo: "+tipeBoleto[i];
    }






}
