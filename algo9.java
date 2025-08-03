import java.util.Scanner;

public class algo9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double h = s.nextDouble();
        System.out.printf("%.2f", Math.sqrt((2 * h) / 9.8));
    }
}
