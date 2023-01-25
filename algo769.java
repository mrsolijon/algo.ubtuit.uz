import java.util.Scanner;



public class algo769 {
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        long A,B;
        A=s.nextLong();
        B=s.nextLong();
        if(A<B)
            System.out.print("<");
        else if (A>B) {
            System.out.print(">");
        }
        else
            System.out.print("=");
    }
}
//    using namespace std;
//    int main{
//        int x,y;
//        cin<<x;
//        cin<<y;
//
//        if (x > y):
//        cout>>('>');
//        else if( x < y):
//        cout>>("<");
//        else:
//        cout>>('=');
//        return 0;
//        }