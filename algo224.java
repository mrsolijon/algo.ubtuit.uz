import java.util.Scanner;

public class algo224 {
	public static void main (String[] args) {
        Scanner s= new Scanner(System.in);
        int t = s.nextInt();
        int a1=t/100000;
        int a2=(t-a1*100000)/10000;
        int a3=(t-a1*100000 -a2*10000)/1000;
        int a4=(t-a1*100000 -a2*10000 - a3*1000)/100;
        int a5=(t-a1*100000 -a2*10000 - a3*1000 -a4*100)/10;
        int a6=t%10;
        if (a1+a3+a5==a2+a4+a6)
            System.out.println( "yes"  );
        else
            System.out.println("no" );
	}
}
