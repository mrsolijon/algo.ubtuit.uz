import java.util.Scanner;

public class algo167 {

    public int fact(int x){
        int fact=1;
        for (int i=1;i<=x; i++){
            fact*=i;
        }
        return fact;
    }
    public double f(double x){
        algo167 fact = new algo167();
    double fx=0;
      for (int k=0; k<=10; k++)
      {
            double q1= Math.pow(x,(2*k+1));
            int fakt = fact.fact(2*k+1);
            fx+=(q1/fakt);
      }
    double fx2 = 0;
      for (int k=0; k<=10; k++)
      {
            int fakt=fact.fact(2*k);
            double q2= Math.pow(x,(2*k));
            fx2+=(q2/fakt);
      }

        return fx/fx2;

    }

	public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double y =scan.nextDouble();
        algo167 f = new algo167();
        double t = f.f(y);
        double yechim;
        yechim=(1.7*t*(0.25)+2*t*(y+1))/(6-t*(Math.pow(y,2)-1));
        System.out.printf("%.2f",yechim);

	}
}
