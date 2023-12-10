import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("put n =");
        int n = sc.nextInt();
        
        double sum = 0.0;

        for (int i = 1; i<= n; i++) {
            sum += 1.0/(i *i);
        }
        System.out.println("sum of series=" + sum);
    }
}