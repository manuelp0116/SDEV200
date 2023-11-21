package SDEV200.exercise_21_3;

import java.util.*;
import java.io.*;
public class Exercise_21_3 {
    public static void main(String[] args) throws Exception {
        //check command line lenght
        if(args.length != 1){
            System.out.println("Usage: java sourceFile");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (file.exists()) {
            System.out.println("The  number of keywords in" + args[0] 
                        + " is " + countKewords(file));
        }
        else {
            System.out.println("File" + args[0] + "does not exist");
        }
    }

    public static int countKewords (File file) throws Exception {
        // Array of all Java keywords + true, false and null
        String[] keywordString = {"abstract", "assert", "boolean",
        "break", "byte", "case", "catch", "char", "class", "const",
        "continue", "default", "do", "double", "else", "enum",
        "extends", "for", "final", "finally", "float", "goto",
        "if", "implements", "import", "instanceof", "int",
        "interface", "long", "native", "new", "package", "private",
        "protected", "public", "return", "short", "static",
        "strictfp", "super", "switch", "synchronized", "this",
        "throw", "throws", "transient", "try", "void", "volatile",
        "while", "true", "false", "null"};

        Set<String> keyWordSet = 
                        new HashSet<>(Arrays.asList(keywordString));

        int count = 0;

        Scanner input = new Scanner(file);

        while(input.hasNext()){
            String word = input.next();
            //omits comments 
            if (word.equals("//")) {
                input.nextLine();
            }
            //omits strings
            else if(word.contains("\"")){
                String nextWord;
                do {
                    nextWord = input.next();
                } while (!nextWord.contains("\""));    
            }
            // omits block comments
            else if(word.contains("/*")){
                String nextWord;
                do {
                    nextWord = input.next();
                } while (!nextWord.contains("*/"));
            }

            else if (keyWordSet.contains(word))
                count++;
        }
        return count;
    }
}
