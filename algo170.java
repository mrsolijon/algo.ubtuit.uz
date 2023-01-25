import java.util.Scanner;

public class algo170 {
    public double h ( double a,double b){
        double h;
        h=a/(b*b+1)+b/(a*a+1)-(Math.pow(a-b,3));
        return h;
    }
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        algo170 h = new algo170();
        double s =sc.nextDouble();
        double t =sc.nextDouble();
        double j = h.h(s,t)+Math.max(h.h(s-t,s*t) ,h.h(s-t,s+t))+h.h(1,1);
        System.out.printf("%.2f",j);
	}
}
