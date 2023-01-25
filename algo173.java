import java.math.BigInteger;
import java.util.Scanner;
public class algo173 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);

		int raqam, h = s.nextInt();

		BigInteger jami = new BigInteger(String.valueOf(0));

		int st = (int) Math.pow(10,h-1), fn=(int) Math.pow(10,h);

		for ( int i = st; i<fn; i++){
			int t = i;
			int p = 1;
			for (int j=h;j>0;j--) {
				raqam = t % 10;
				if (raqam == 0){
					p=0;
					break;
				}
				else{
					p *= raqam;
					t = t / 10;
				}
			}
			 jami = jami.add(BigInteger.valueOf(p));
		}
		System.out.println(jami );
		jami = jami.remainder (BigInteger.valueOf(1000000007));

		System.out.println(jami );
	}
}
