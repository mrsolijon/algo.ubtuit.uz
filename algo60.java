import java.util.Scanner;

public class algo60 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        double  x,y;

        x = s.nextDouble();
        y = s.nextDouble();

        if (x<=0 && (y<=1+x/2) && y>=-(1+x/2)) {
                System.out.println("yes");
        }
        else if ((x<=1) && (Math.pow(x,2)+Math.pow(y,2)<=1) ) {
            System.out.println("yes");
        }
        else
            System.out.println("no");

    }
}
