import java.util.Scanner;

public class algo165 {
     public double f (double a , double b , double c){
        double f = (2*a-b-Math.sin(c))/(5+Math.abs(c));
        return f;
    }

	public static void main (String[] args) {
        Scanner S= new Scanner(System.in);
        double t= S.nextDouble();
        double s= S.nextDouble();
        algo165 f = new algo165();
       double j1 = f.f( t,-2*s,1.17 );
       double j2 = f.f( 2.2, t,s-t);
        System.out.printf("%.02f",j1+j2 );
	}
}
