package SDEV200.exercise_12_9;

public class exercise_12_9 {
    public static void main(String[] args) {

        System.out.println(binToDec("10100101"));
        System.out.println(binToDec("assdds"));


    }

    //Binary to decimal method

    public static int binToDec(String binary) throws binaryFormatException {

        if (!isBinary(binary)){
            throw new binaryFormatException(binary + " is not a binary number");
        }

        int power = 0;
        int decimal = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;

    }

    //isBinary method
    public static boolean isBinary(String binary){
        for(char ch: binary.toCharArray()) {
            if (ch != '1' && ch != '0') return false;
        }
        return true;
    }
}

//Exception class, pulls from IllegalArgumentException
    class binaryFormatException extends IllegalArgumentException {
        public binaryFormatException(String s) {
            super(s);
        }
     }
