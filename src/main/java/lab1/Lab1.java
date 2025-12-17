package lab1;

public class Lab1 {
    public static void main(String[] args) {
        int recordBookNumber = 4216;

        int n = 10;
        int m = 10;

        try {
            double s = Lab1Calculator.calculate(n, m);

            System.out.println("Record book number: " + recordBookNumber);
            System.out.println("Derived constants: C2=0, C3=1, C5=1, C7=2");
            System.out.println("Operators: O1='+', O2='/' (integer division), C=1");
            System.out.println("n=" + n + ", m=" + m);
            System.out.println("Result S = " + s);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
