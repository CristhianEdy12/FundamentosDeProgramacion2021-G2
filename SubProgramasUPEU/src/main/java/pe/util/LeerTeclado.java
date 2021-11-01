package pe.edu.upeu.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerTeclado{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

public int Leer(int valor, String msg){
  System.out.print(msg+": ");
try{
  valor=Integer.parseInt(br.readLine());
}catch(Exeption e){
  valor=leer(valor, msg);
}
 return valor;
}

public long Leer(long valor, String msg){

return 0;
}

public char Leer(char valor, String msg){
return 0;
}
public String leer(String valor, String msg){
return "";
}

}