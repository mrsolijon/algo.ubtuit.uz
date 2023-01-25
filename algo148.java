import java.util.ArrayList;
import java.util.Scanner;

public class algo148 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        String[] s= t.split(" ");
        for (int i=0; i<s.length;i++){
           char[] n = s[i].toCharArray();
                if ( n[0] == 'A'){
                    System.out.println( s[i] );
                }
                else
                    continue;
        }

    }
}

