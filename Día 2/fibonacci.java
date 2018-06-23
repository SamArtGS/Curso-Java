import java.util.Scanner;
public class fibonacci{
	public int fibo() {
		int tmp=0;
		int tiempo = 5;
		int f1=0, f2=1;
		Scanner dr = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de números de Fibonacci que desea mostrar: ");
		int conta = dr.nextInt();
		if (conta==1||conta<=0){
			System.out.println("Opción no válida");
		}else if (conta==2) {
			System.out.println(+(f1+1)+f2);
		}else{
            for(int i=0;i<=conta;i++){
        	tmp = f1+f2;
        	System.out.printf("%d  ",tmp);
        	f1=f2;
        	f2=tmp;
        }
		}
		System.out.println("\n");
		return 5;
	}

}