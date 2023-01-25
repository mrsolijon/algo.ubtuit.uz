
import java.util.Scanner;

public class algo150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c=0;
        String t2;
        String t = scanner.nextLine();
        String[] s= t.split(" ");
        for (int i=0; i<s.length;i++){
            char[] n = s[i].toCharArray();
            if (( n[0] == 'I' || n[0]== ('i'))  && ( n[1] == 'N' || n[1]== ('n')) && ( n[2] == 'F' || n[2]== ('f')) && ( n[3] == 'O' || n[3]== ('o')))
            {
                System.out.print(s[i] + ' ' );
            }
            else
                continue;
        }


    }
}

