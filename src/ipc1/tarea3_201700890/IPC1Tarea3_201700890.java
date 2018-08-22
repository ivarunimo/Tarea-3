
package ipc1.tarea3_201700890;



import java.util.Scanner;
public class IPC1Tarea3_201700890 {
   public static void main(String[] args){
    Scanner in= new Scanner(System.in);
    int men,submen;
    System.out.println("[IPC1]Tarea3_201700890");
    System.out.println("");
    System.out.println("1.Usuarios");
    System.out.println("2.Contador de digitos repetidos");
    System.out.println("3.Tres numeros de mayor a menor");
    System.out.println("4.Calcular promedio");
    System.out.println("5.Salir");
    men= in.nextInt();
    if (men<1 || men>5){
     
        System.out.println("Esa opcion no existe");
    }
   
    switch(men){
       case 1:
           System.out.println("1.Ingresar Usuarios");
           System.out.println("2.Mostrar Usuarios ascendente");
           System.out.println("3.Mostrar Usuarios descendente");
           System.out.println("4.Menu Principal");
           submen=in.nextInt();
           if (submen<1 || submen>5){
               System.out.println("Esa opcion no existe");
           }
           switch(submen){
               case 1:
                   System.out.println("Ingresar usuario");
           }
       break;
       case 2:
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
       break;
       case 3:
       break;
       case 4:
       break;
       case 5:
       break;

   }
   }
}
