import java.util.Scanner;

public class algo5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat(), b = s.nextFloat(), c = s.nextFloat();
        System.out.printf("%.2f", (a + b + c) / 2);
    }
}