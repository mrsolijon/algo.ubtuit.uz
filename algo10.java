import java.util.Scanner;

public class algo10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.print((x * 365*24*60*60) / 1000);
    }
}
