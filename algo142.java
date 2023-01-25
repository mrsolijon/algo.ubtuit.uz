import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class algo142 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[][] A = new int[n+1][n+1];
        ArrayList<Integer> A2= new ArrayList<>();
        for (int i=1; i<=n;i++) {
            for (int j = 1; j <= n; j++){

                A[i][j] = s.nextInt();
                if(i<=j)
                    A2.add(A[i][j]);
                else
                    continue;
            }
        }
        int max = A2.get(0);
        for (int i = 1; i < A2.size(); i++) {
            if (max < A2.get(i))
                max = A2.get(i);
        }
        int min = A2.get(0);
        for (int i = 1; i < A2.size(); i++) {
            if (min > A2.get(i))
                min = A2.get(i);
        }
            for(int i=0; i<A2.size();i++)
                System.out.print(A2.get(i) + " ");
            System.out.println();
            System.out.print(max + " " + min);

    }

}

