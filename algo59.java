import java.util.Scanner;

public class algo59 {
    public static void main(String []args){
        double x,y;
        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        y = s.nextDouble();

        if ( y<=1-Math.abs(2*x) && y>=Math.abs(2*x)-1  )
            System.out.println("yes");
        else
        System.out.println("no");
    }
}
