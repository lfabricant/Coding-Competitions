// the name of the class has to be the same as the name of the file
import java.util.Scanner;

public class cattoys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // easiest way to read from stdin
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b > a){
            System.out.println(1);
        }else {
            int r = a/b + a%b;
            System.out.println(r);
        }
    }
}
