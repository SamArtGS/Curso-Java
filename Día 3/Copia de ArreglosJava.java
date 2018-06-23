//Arreglos en java
//Cuando creas un arreglo se va almacenando de forma consecutiva
//{1,2,3}

/*
	Un arreglo se puede declarar de las siguientes maneras:
	int a[];
	String []cadena;
	double[]ejemplo;
	int ejemplo[]=new int[10];

	int areglo[]=new int[3];

*/
public class ArreglosJava{
	public static void main(String[] args) {
		int indice=Integer.parseInt(args[0]);
		String meses[]={"Enero","Febrero","Marzo","Abril","Mayo", "Junio", "Julio", "Agosto", "Septiembre","Octubre","Noviembre","Diciembre"};
		System.out.println("El mes correspondiente al número" +indice+ " es: " +meses[indice-1]);
	}
}

//Clases estáticas, están prestablecidas, sol ose tiene que importar la clase, como la clase matemáticas o array

