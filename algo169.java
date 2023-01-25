import java.util.Scanner;

public class algo169 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		double a,b;
		a=s.nextDouble();
		b=s.nextDouble();
		double u = Math.min(a,b);
		double v = Math.min(a*b,Math.max(a,b));
		double c = Math.min(u+v,3.14);
		System.out.printf("%.2f", u );
		System.out.print(" ");
		System.out.printf("%.2f", v );
		System.out.print(" ");
		System.out.printf("%.2f", c );


	}
}
