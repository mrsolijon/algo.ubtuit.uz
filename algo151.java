import java.util.Scanner;

public class algo151 {
	public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
		int c=0;
        String t = s.nextLine( );
		char [] b =t.toCharArray();
		for ( int i=0;i<b.length; i++ ){
			switch (b[i]) {
				case 'E' , 'e' , 'I' , 'i' , 'U' , 'u' , 'O' , 'o','a','A':
					c++;
					break;
				default:
					continue;
			}

		}
		System.out.println( c );

	}
}
