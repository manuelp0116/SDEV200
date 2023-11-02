package SDEV200;
public class FootMeter {
    public static void main(String[] args) {
        double feet = 0; double meter = 20;
            //conversion formula
        footToMeter(feet);
        System.out.println();
        meterToFoot(meter);   
    }

    public static void footToMeter(double feet) {
            //meter to feet formula
        System.out.println("Feet\t\tMeters");
        System.out.println("------------------------------");
        for(double foots = 1; foots < 11; foots++) {
            double meterFormula = 0.305 * foots;
            System.out.println(foots+"\t\t"+meterFormula);
        }
    }

    public static void meterToFoot(double meter) {
        System.out.println("Meters\t\tFeet");
        System.out.println("------------------------------");
        for(double meters = 20.0; meters < 70.0; meters += 5){
            double feetFormula = 3.279 * meters;
            System.out.println(meters+"\t\t"+feetFormula);
        }
    }


}
