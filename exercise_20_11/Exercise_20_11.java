package SDEV200.exercise_20_11;

import java.io.*;
import java.util.*;

public class Exercise_20_11 {

    public static void main(String[] args) throws IOException {
        //Check command-line args
        if(args.length != 1) {
            System.out.println("Usage: Java exercise_20_11 Source-codeFileName");
            System.exit(0);
        }

        //check if file exists
        File file =  new File(args[0]);
        if(!file.exists()) {
            System.out.println("The file" + args[0] + " does not exist!");
            System.exit(1);
        }
        
        Stack<Character> symbols = new Stack<>();

        try (
            Scanner input = new Scanner(file);
        ) {
           while (input.hasNext()) {
            String line = input.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    //push symbols on the stack
                    if (ch == '(' || ch == '{' || ch == '[') {
                    symbols.push(ch);
                    } //process stack
                    else if (ch == ')' || ch == '}' || ch == ']') {
                    processSymbols(symbols, ch);;
                    }
                }
            } 
        }

        System.out.println("The Java source-code" + (symbols.isEmpty() ? "has" : "does not have") + " correct pairs.");
    }


    private static void processSymbols (Stack<Character> stack, Character ch){
        //remove matching symbols
        if ((stack.peek() == '(' && ch == ')') ||
            (stack.peek() == '[' && ch == ']') ||
            (stack.peek() == '{' && ch == '}')) {
                stack.pop();
        }
        else if ((stack.peek() != '(' && ch == ')') ||
                 (stack.peek() != '{' && ch == '}') ||
                 (stack.peek() != '[' && ch == ']')) {
                System.out.println("The Java source code does not have" 
                                    + "correct pairs."); 
                System.exit(1);
                 
        }
        
    }
}
