import java.util.Scanner;

public class algo2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float r1 = s.nextFloat();
        float r2 = s.nextFloat();
        float r3 = s.nextFloat();
        System.out.printf("%.2f %.2f %.2f",
                Math.PI * r1 * r1,
                Math.PI * r2 * r2,
                Math.PI * r3 * r3
        );
    }
}
