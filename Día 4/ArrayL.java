import java.util.ArrayList;
public class ArrayL{
	public static void main(String[] args) {
		ArrayList<String> nombres=new ArrayList<String>();

		System.out.println("¿La lista esta vacia?");
		System.out.println("¿Vacia? "+nombres.isEmpty());
		System.out.println("tamaño: "+nombres.size());
		imprimirArregloDinamico(nombres);

		//añadir elementos
		System.out.println("Añadiendo elementos");
		nombres.add("Pedro");
		nombres.add("Jorge");
		nombres.add("Jose");
		System.out.println("¿Vacia? "+nombres.isEmpty());
		System.out.println("tamaño: "+nombres.size());
		imprimirArregloDinamico(nombres);

		//añadir elemento en el indice 2
		System.out.println("añadir elemento en el indice 2");
		nombres.add(2,"Sofia");
		System.out.println("¿Vacia? "+nombres.isEmpty());
		System.out.println("tamaño: "+nombres.size());
		imprimirArregloDinamico(nombres);

		//elimar por objecto
		System.out.println("Borrando por objeto a sofia");
		nombres.remove("Sofia");
		System.out.println("¿Vacia? "+nombres.isEmpty());
		System.out.println("tamaño: "+nombres.size());
		imprimirArregloDinamico(nombres);

		//eliminar a jorge por indice
		System.out.println("Borrando por indice a jorge");
		nombres.remove(1);
		System.out.println("¿Vacia? "+nombres.isEmpty());
		System.out.println("tamaño: "+nombres.size());
		imprimirArregloDinamico(nombres);

		//borrar todos los elementos
		System.out.println("Borrando a todos los elementos");
		nombres.clear();
		System.out.println("¿Vacia? "+nombres.isEmpty());
		System.out.println("tamaño: "+nombres.size());
		imprimirArregloDinamico(nombres);
	}

	public static void imprimirArregloDinamico(ArrayList<String> arreglo){
		System.out.print("Arreglo dinamico: ");
		for(String temp: arreglo){
			System.out.print(temp+" ");
		}
		System.out.println("\n");
	}
}