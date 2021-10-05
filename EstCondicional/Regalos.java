import java.util.Scanner;
public class Regalos{
  static Scanner sc = new Scanner(System.in);
  static void algoritmoRegalos(){
    //Definir Variables
    double monto=0;
    String regalo="";
    //Datod de entrada
    System.out.println("Ingrese el monto que dispone");
    monto=sc.nextDouble();
    //Proceso
    if (monto<1 && monto<=10){
      regalo+="\nTarjeta";
    }
   else if(monto>=11 && monto<=100){
      regalo="\nChocolate\nTarjeta";
    }
    else if(monto>=101 && monto<=250){
     regalo="\nFlores\nChocolate\nTarjeta";
     }
   else if(monto>250){
     regalo="\nAnillo\nFlores\nChocolate\nTarjeta";
     }
   else{
     regalo="ninguno";
  }
   //Datos de salida
   System.out.println("Ud. puede elegir los siguientes: "+ regalo);
  }
  public static void main(String[] arg){
  algoritmoRegalos();
}
}


}static void mesdelAnho(){
  //Declarar Variables
  int mesNum;
  Sting mesLetra;
  //Datos de entrada
  System.out,println("Ingrese el numero dek¡l mes entre 1-12:");
  mesNum=sc.nextInt();
  //Proceso
  switch(mesNum){
   case 1: mesLetra="enero"; break;
   case 2: mesLetra="Febrero"; break;
   case 3: mesLetra="Marzo"; break;
   case 4: mesLetra="Abril"; break;
   case 5: mesLetra="Mayo"; break;
   case 6: mesLetra="Junio"; break;
   case 7: mesLetra="Julio"; break;
   case 8: mesLetra="Agosto"; break;
   case 9: mesLetra="Setiembre"; break;
   case 10: mesLetra="Octubre"; break;
   case 11: mesLetra="Noviembre"; break;
   case 12: mesLetra="Diciembre"; break;
   default:
   mesLetra="no existe"
    Syetem.out.println("El mes no es valido");break;
  }
  //Datos de salida
  System.out.println("El mes "+mesNum+"es:"+mesLetra);
}


public static void main(String[] arg){
//algoritmoRegalos();
  //pagoPolizas();
  mesdelAncho();