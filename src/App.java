import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import controllers.Cola;
import controllers.ColaG;
import controllers.Stack;
import controllers.StackG;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        //Pila - Stack
        System.out.println("Stack");
        Stack stack = new Stack();
        //stack.push(10);
        //stack.push(-1);
        //stack.push(0);
        //stack.push(5);
        //System.out.println("Tam: " + stack.size());
        //stack.printStack();
        //stack.pop();
        //System.out.println("Tam: " + stack.size());
        //stack.peek();
        //stack.printStack();
        //Pila o Stack Genérica
        //System.out.println("Stack Generica");
        StackG <Integer> stackG = new StackG<>();
        stackG.push(10);
        stackG.push(-1);
        stackG.push(0);
        stackG.push(5);
        //stackG.printStack();
        //StackG <String> stackG2 = new StackG<>();
        //stackG2.push("Uno");
        //stackG2.push("Cuatro");
        //stackG2.printStack();
        //Cola 
        //System.out.println("Cola");
        //Cola cola = new Cola();
        //cola.add(5);
        //cola.add(7);
        //cola.add(10);
        //System.out.println("Tam: " + cola.size);
        //cola.printCola();
        //cola.remove();
        //System.out.println("Tam: " + cola.size);
        //cola.printCola();
        //Cola Generica
        //System.out.println("COLA GENERICA");
        //Persona p1 = new Persona("Pablo");
        //Persona p2 = new Persona("Juan");
        //Persona p3 = new Persona("María");
        //Persona p4 = new Persona("David");
        //ColaG<Persona> colaP = new ColaG<>();
        //colaP.add(p1);
        //colaP.add(p2);
        //colaP.add(p3);
        //colaP.add(p4);
        //System.out.println("Tamaño de la cola: " + colaP.size());
        //colaP.printColaG();
        //System.out.println("Tiene a la persona -> " + colaP.remove());
        //System.out.println("Tamaño de la cola: " + colaP.size());
        //colaP.printColaG();
        //System.out.println("Búsqueda");
        //colaP.findByName("David");
        //Persona pEliminada = colaP.removeByName("David");
        //if(pEliminada != null) {
            //System.out.println("Se eliminó a: " + pEliminada.getNombre());
        //} else {
            //System.out.println("No se encontró a David");
        //}
        //colaP.printColaG();
        System.out.println("===Validación de Signos===");
        String cadena1 = "([]){}";
        String cadena2 = "({)}";
        System.out.println("Test 1: " + SignValidator.isValid(cadena1));
        System.out.println("Test 2: " + SignValidator.isValid(cadena2));

        System.out.println("===Ordenar Stack===");
        stackG.printStack();
        StackSorter sorter = new StackSorter();
        sorter.sortStack(stackG);
        stackG.printStack();
    }
}
