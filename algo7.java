import java.util.Scanner;

public class algo7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double h = s.nextDouble(), r = s.nextDouble(), V = (Math.PI * r * r * h) / 3;
        System.out.printf("%.2f", V);
    }
}
