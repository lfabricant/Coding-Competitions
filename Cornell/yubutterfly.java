import java.util.Scanner;
public class yubutterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String a = sc.nextLine();
        if(a.equals("Has a stripe")){
            System.out.println("Viceroy");
        }else {
            System.out.println("Monarch");
        }
    }
}
