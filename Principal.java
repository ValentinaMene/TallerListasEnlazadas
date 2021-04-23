
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opc=0;

        Lista listaSimple=new Lista();
        System.out.println("Se ha creado su lista");
        do{
            System.out.println("Listas Enlazadas Simples");
            System.out.println("1. Insertar por el Comienzo");
            System.out.println("2. Insertar por el Final");
            System.out.println("3. Mostrar Lista");
            System.out.println("4. Localizar X");
            System.out.println("5. Agregar cabeza (D)");
            System.out.println("6. Devolver Ultimo");
            System.out.println("7. Agregar ultimo (D)");
            System.out.println("8. Agregar en posicion(I,D)");
            System.out.println("9. Suprimir cabeza");
            System.out.println("10. Suprimir final");
            System.out.println("11. Suprimir posicion(I)");
            System.out.println("12. Salir");
            System.out.println("Ingrese su opción:");
            opc=teclado.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Ingrese una letra:");
                    listaSimple.InsertarComienzo(teclado.next());
                    break;
                case 2:
                    System.out.println("Ingrese una letra:");
                    listaSimple.InsertarFinal(teclado.next());
                    break;
                case 3:
                    System.out.println("Elementos de la Lista");
                    listaSimple.MostrarLista();
                    break;
                case 4:
                    listaSimple.ListaBuscarX();;
                    break;
                case 5:
                    listaSimple.InsertarComienzoD();
                    break;
                case 6:
                    listaSimple.MostrarUltimo();
                    break;
                case 7:
                    listaSimple.InsertarFinalD();
                    break;  
                case 8:
                    System.out.println("Ingrese la posicion de la lista la cual desea agregar el nodo:");
                    listaSimple.InsertarPosD(teclado.nextInt());
                    break;    
                case 9:
                    listaSimple.SuprimirCAB();
                    break;  
                case 10:
                    listaSimple.ListaSuprimirFinal();
                    break; 
                case 11:
                    System.out.println("Ingrese la posicion de la lista la cual desea suprimir el nodo:");
                    listaSimple.ListaSuprimirPos(teclado.nextInt());
                    break;    
            }
        }while(opc<12); 
}  
}
