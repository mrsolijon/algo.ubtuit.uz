import java.util.Scanner;

public class algo319 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,c,MAX,MIN;
        a=s.nextInt();
         b=s.nextInt();
         c=s.nextInt();
         MAX=Math.max(a,b);
        MAX=Math.max(MAX,c);
        MIN=Math.min(a,b);
        MIN=Math.min(MIN,c);
        System.out.printf("%.1f",(MAX+MIN)/2.0);
    }
}
