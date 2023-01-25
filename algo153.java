import java.util.Scanner;

public class algo153 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		String t = s.nextLine();
		String[] te=t.split(" ");
		for ( int i =0 ; i<te.length;i++ )
		{
			char[] a= te[i].toCharArray();
			System.out.println(te[i] + " " + (a.length) );
		}

	}
}
