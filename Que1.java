import java.util.Scanner;
import java.lang.Math;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("put x =");
        double x = sc.nextDouble();

        double r = x * Math.PI/180.0;

        System.out.println("put n =");
        double n = sc.nextDouble();
        
        double fact = 1.0;
        double sum = 0.0;
        double b = 1.0;

        for (double i = 1.0; i<=n ; i++) {
            fact = fact * i;
            if (i % 2.0 != 0) {
                sum = sum + b*(Math.pow(r, i)/fact);
                b = 1.0*b;
            }
        } System.out.println("Cos x = "+ sum);
    }
}