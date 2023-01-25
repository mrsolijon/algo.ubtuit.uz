import java.util.Scanner;

public class algo166 {
    public double f (double a , double b){
        double f = (Math.pow(a,2)+Math.pow(b,2))/(Math.pow(a,2)+2*a*b+3*b*b+4);
        return f;
    }

    public static void main (String[] args) {
        Scanner S= new Scanner(System.in);
        double t= S.nextDouble();
        double s= S.nextDouble();
        algo166 f = new algo166();
        double j1 = f.f (1.2, s );
        double j2 = f.f (t,s );
        double j3 = f.f (2*s-1,s*t );
        System.out.printf("%.02f",j1+j2 +j3);
    }
}
