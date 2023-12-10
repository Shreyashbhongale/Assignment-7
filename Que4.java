import java.util.Scanner;
import java.lang.Math;

public class Que4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("put a =");
        int a = sc.nextInt();

        System.out.println("put n =");
        int n = sc.nextInt();

        double sum = 0.0;
        for ( int i = 1; i <= n ; i++) {
            sum += (double) i/Math.pow(a, i);
        }System.out.println("sum of series =" + sum);

    }}