import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("put n =");
        int n = sc.nextInt();
        
        double sum = 0.0;
        for (int i = 1; i<=n; i++) {
            sum += (double) i/i;
        }
        System.out.println("sum of series ="+ sum);
    }}