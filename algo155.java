import java.util.Scanner;

public class algo155 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.nextLine();
        int c=0;
        String[] te=t.split(" ");
        for ( int i =0 ; i<te.length;i++ )
        {
           char[] a= te[i].toCharArray();
           if (a[0]>=(65)&&(a[0]<=90))
                c++;
        }
        System.out.println(c );
    }
}