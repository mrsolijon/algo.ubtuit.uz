import java.util.Scanner;

public class algo152 {
	public static void main (String[] args) {
        Scanner s =new Scanner(System.in);
        String t = s.nextLine();
        char[] a= t.toCharArray();
        for ( int i=a.length-1; i>=0;i-- )
            System.out.print(a[i] );

	}
}
