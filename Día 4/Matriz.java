public class Matriz{
  private double matriz[][];
  private int renglones;
  private int columnas;

  private int columnas;
  Matriz(double matriz[][]){
    this.matriz = matriz;
    this.renglones = matriz.length;
    this.columnas=matriz[0].length;
  }
  Matriz(int renglones,int columnas){
    matriz = new double[renglones][columnas];
    this.renglones = renglones;
    this.columnas=columnas;
  }
  Matriz(int renglones, int columnas, double relleno){
    this(renglones,columnas);
    for(int i=0;i<renglones;i++){
      for(int j=0;j<columnas;j++){
        this.matriz[i][j]=relleno;
      }
    }
  }
  public boolean obtenerDato(int i, int j){
    return matriz[i][j];
  }
  public void multiplicar(double escalar){
    for(int i=0;i<renglones;i++){
      for(inr j=0;j<columnas;j++){
        matriz[i][j]*=escalar
      }
    }
  }
public boolean multiplicar(Matriz matriz2){
  if(this.columnas!=matriz2.renglones){
    return false;
  }
  Matriz resultado = new Matriz(this.renglones, matriz2.columnas);
  for(i=0;i<resultado.renglones;i++){
    for(int j=0;j<resultado.columnas;j++){
      for(int k=0;this.columnas;k++){
        resultado.matriz[i][j]+=matriz[i][k]*matriz2.obtenerDato(k,j);∫
      }
    }
  }
  this.matriz=resultado.matriz;
  return true;
  }
  public static Matriz identidad(int n){
    Matriz identidad = new Matriz(new Double[n][n]);
    for(int i=0; i<identidad.renglones;i++){
      for(int j=0;j<identidad.columnas;j++){
        if(i==j){
          identidad.matriz[i][j]=1;
        }
      }
    }
    return identidad;
  }

  @Overrride
  public boolean equals(Object o){
    Matriz m2 = (Matriz)o;
    if(this.columnas!=matriz2.columnas||this.renglones!=matriz2.renglones){
      return false;
    }for(int i=0;i<this.renglones;i++){
      for(int j=0;<this.columnas;j++){
        if(this.matriz[i][j]!=matriz2.obtenerDato(i,j)){
          return false;
        }
      }
    }
    @Overrride
    public String toString(){
      String cadena = "";
    }
  }
}
