package pe.edu.upeu;
import pe.edu.upeu.modulo.*;
<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> 00b16be860e2dd7f4e90f43ab0dcef57824d8513
/**
 * Hello world!
 *
 */
<<<<<<< HEAD
public class FibonaciMain {

    static SubProgramas sp=new SubProgramas();
    static Recursividad re=new Recursividad();
    static Scanner sc=new Scanner(System.in);

static void menuOpciones(){
    int opcion=0;
    String msg="Eliga el algoritmo que desea probar"+"\n1=Factorial"
    +"\n2=fibonaci Recur";
    +"\n2=fibonaci Recur";
    System.out.println(msg);
    opcion=sc.nextInt();
    while(opcion!=0){
        switch(opcion){
            case 1:
            System.out.println("Ingrese un numero:");      
            //long valor=re.factorialBig(sc.nextLong());
            System.out.println(re.factorialBig(sc.nextLong())); break;
            default: System.out.println("Opcion no existe!");
        }
      System.out.println(msg);
      opcion=sc.nextInt();    
    }
  }    

    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        menuOpciones();
=======
public class App {

    static SubProgramas sp=new SubProgramas();

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ps.saludo();
>>>>>>> 00b16be860e2dd7f4e90f43ab0dcef57824d8513
    }
}
