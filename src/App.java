
import materia.stacks.Stacks;



public class App {
    public static void main(String[] args) throws Exception {
        runStack();
    }
    public static void runStack(){
     //instanciar la clase
        Stacks stack= new Stacks();
    //agregar elemento a la pila
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);
        //mostrar valores
    System.out.println("cima    --> "+stack.peek()+" nodo en la cima");
    System.out.println("retirar --> "+stack.pop()+" se retira nodo");
    System.out.println("cima    --> "+stack.peek()+" nodo en la cima");
    System.out.println("retirar --> "+stack.pop()+" se retira nodo");
    System.out.println("cima    --> "+stack.peek()+" nodo en la cima");
    System.out.println("retirar --> "+stack.pop()+" se retira nodo");
    System.out.println("cima    --> "+stack.peek()+" nodo en la cima");
    }
}
