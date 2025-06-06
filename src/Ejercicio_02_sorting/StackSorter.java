package Ejercicio_02_sorting;

import controllers.StackG;

public class StackSorter {
    public void sortStack(StackG<Integer> stack) {
        StackG<Integer> auxS = new StackG<>();
        while(!stack.isEmpty()) {
            int aux = stack.pop();
            while(!auxS.isEmpty() && auxS.peek() > aux) {
                stack.push(auxS.pop());
            }
            auxS.push(aux);
        }
        while(!auxS.isEmpty()) {
            stack.push(auxS.pop());
        }
    }    
}
