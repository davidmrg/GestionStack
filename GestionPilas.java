
package gestionpilas;
import java.util.Scanner;
import java.util.Stack;

public class GestionPilas {

    Stack<Integer> pilaStack;
   
    public static void main(String[] args) {
        
        GestionPilas obj = new GestionPilas();
        obj.pilaStack = new Stack();
        
        obj.LeerOpcion();
        
    }
    
    public void LeerOpcion(){
        Scanner teclado = new Scanner (System.in);
        int opc;
        do{
        System.out.println("Seleccione su opción");
        System.out.println("1. Consultar si la pila está vacía");
        System.out.println("2. Consultar el tope de la pila sin remover");
        System.out.println("3. Remover el elemento tope de la pila y retornar su valor");
        System.out.println("4. Agregar un elemento en tope de la pila");
        System.out.println("5. Buscar..");
        System.out.println("6. Imprimir todos los elementos de la pila");
        System.out.println("7. Salir");
        opc = teclado.nextInt();
        
        switch(opc){
            case 1: 
                consultarVacia();
                break;
            case 2: 
                topeSinRemover();
                break;                 
            case 3: 
                topeRemoviendo();
                break; 
            case 4: 
                agregarTope();
                break; 
            case 5: 
                buscar();
                break;    
                
            case 6: 
                imprimirTodo();
                break;
        }
    }while(opc != 7);
        
    }
    
    public void consultarVacia(){
        System.out.println(pilaStack.empty());
    }
    
    public void topeSinRemover(){
        System.out.println("El Elemento tope de la pila es: " + pilaStack.peek());
    }
    
    public void topeRemoviendo(){
        System.out.println("El elemento removido del tope tenía el valor: " + pilaStack.pop());
    }
    
    public void agregarTope(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite el valor del elemento para agregar en la pila: ");
        int i = sc.nextInt();
        pilaStack.push(i);
        System.out.println("El elemento " + i + "se agregó a la pila");
        
    }
    
    public void buscar(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite el valor del elemento para buscar en la pila: ");
        int i = sc.nextInt();
        int x = pilaStack.search(i);
    }
    
    public void imprimirTodo(){
        for(int i = 0; i<pilaStack.size(); i++){
            System.out.println("El elemento en la posición " + i + " es: " + pilaStack.get(i));
        }
        
    }
    
    
}
