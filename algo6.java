import java.util.Scanner;

public class algo6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble(), b = s.nextDouble(), h = s.nextDouble();
        double R = a / 2, r = b / 2, l = Math.sqrt(Math.pow(R - r, 2) + h * h), S = Math.PI * (R + r) * l + Math.PI * R * R + Math.PI * r * r;
        System.out.printf("%.2f", S);
    }
}
