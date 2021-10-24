import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            String line = input.nextLine();
            String line2 = input.nextLine();
            if (line.length() > line2.length()){
                System.out.println("first");
            } else {
                System.out.println("second");
            }
        }
    }
}
