import java.util.Scanner;

public class algo171 {
		public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int n,k,m;
		n=s.nextInt();
			int[] x = new  int[n+1];
			for ( int i=1 ; i<=n; i++ ){
				x[i]=s.nextInt();
			}
		k=s.nextInt();
		m=s.nextInt();
		int s1=0,s2=0,s3=0,s4=0;
		for ( int i=1;i<=m-k;i++ )
			s1+=x[i];
		for ( int i=1;i<=k;i++ )
			s2+=x[i];
		for ( int i=1;i<=m;i++ )
			s3+=x[i];
		for ( int i=1;i<=4;i++ )
			s4+=x[i];
		double j = (s1+s2)/Math.pow((s3-s4),2);
		System.out.printf("%.2f",j);
	}
	}
