import java.util.Scanner;

public class algo172 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] fn = new int[n+1];
		fn[0] = 0;
		fn[1] = 1;
		for (int i=2;i<=n;i++){
			fn[i]=fn[i-2]+fn[i-1];
		}
		System.out.println(fn[n-1] );

	}
}
