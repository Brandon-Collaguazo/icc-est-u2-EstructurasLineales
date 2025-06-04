import controllers.Cola;
import controllers.ColaG;
import controllers.Stack;
import controllers.StackG;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Stack");
        //Stack stack = new Stack();
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
        //System.out.println("Stack Generica");
        //StackG <Integer> stackG = new StackG<>();
        //stackG.push(1);
        //stackG.push(4);
        //stackG.printStack();
        //StackG <String> stackG2 = new StackG<>();
        //stackG2.push("Uno");
        //stackG2.push("Cuatro");
        //stackG2.printStack(); 
        System.out.println("Cola");
        Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        System.out.println("Tam: " + cola.size);
        cola.printCola();
        cola.remove();
        System.out.println("Tam: " + cola.size);
        cola.printCola();
        System.out.println("COLA GENERICA");
        Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("María");
        ColaG<Persona> colaP = new ColaG<>();
        colaP.add(p1);
        colaP.add(p2);
        colaP.add(p3);
        System.out.println("Tamaño de la cola: " + colaP.size());
        colaP.printColaG();
        System.out.println("Tiene a la persona -> " + colaP.remove());
        System.out.println(colaP.size());
        colaP.printColaG();
    }
}
