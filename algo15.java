import java.util.Scanner;

public class algo15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float R1 = s.nextFloat(),R2 = s.nextFloat(),R3 = s.nextFloat();
        System.out.printf("%.2f", 1/( (1 / R1) + (1 / R2) + (1 / R3)));
    }
}
