import java.util.Scanner;
public class primo{
	public int prim() {
		int n=0;
		int tiempo = 5;
		Scanner cc = new Scanner(System.in);
		System.out.print("Ingrese el número para definir si es primo: ");
		n = cc.nextInt();
		int i=1,j=0;
		for(i=2;i<n;i++){
			if(n%i==0){
				j=j+1;
			}
		}
		if(j==0){
			System.out.println("El número es primo");
		}else{
			System.out.println("El número no es primo");
		}
		return 5;
	}
}