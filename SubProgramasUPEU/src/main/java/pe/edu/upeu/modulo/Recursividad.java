package pe.edu.upeu.modulo;
import java.math.BigInteger;

public class Recursividad{

public int factorial(int n){
  if(n>1){
    return factorial(n-1)*n;
  }
  return 1;  
}

public BigInteger factorialBig(long n){
  if(n>1){
    return factorialBig(n-1).multiply(new BigInteger(String.valueOf(n)));
  }
  return new BigInteger(String.valueOf(1));
}

public long fibonacci(long n){//5
  if(n>1){
      return fibonacci(n-1)+fibonacci(n-2);
  }
  return 0;
}
//0,1,1,2,3,5,8,13,21,34,55.
public long fibonaccix(long n){
 int valAnt=0, valNew=1, valAux=0;
  if(n>1){
    for(int i=1, i<n; 1++){
       valAlux=valNew;
       valNew=valAnt+valAux;
       valAnt=valAlux;
    }
    return valNew;
  }
  return n;
}

}