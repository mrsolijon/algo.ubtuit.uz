import java.util.Scanner;

public class algo168 {
    public static void main (String[] args) {
        Scanner s= new Scanner(System.in);
        double a,b,c;
        a=s.nextDouble();
        b=s.nextDouble();
        c=s.nextDouble();
         double j;
         j=(Math.max(a,a+b)+Math.max(a,b+c))/(1+Math.max(a+b*c,1.15));
        System.out.printf("%.2f",j);

	}
}
