package Ejercicio_01_sign;

import controllers.StackG;

public class SignValidator {
    public static boolean isValid(String s) {
        StackG<Character> stChar = new StackG<>();
        for(int i = 0; i < s.length(); i++) {
            char op = s.charAt(i);
            if(op == '(' || op == '{' || op == '[') {
                stChar.push(op);
            } else {
                if(stChar.isEmpty())
                    return false;
                char top = stChar.pop();
                if((op == ')' && top != '(') || (op == ']' && top != '[') || (op == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stChar.isEmpty();
    }
}
