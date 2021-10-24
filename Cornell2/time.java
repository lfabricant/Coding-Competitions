import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
                String line = input.nextLine();
                System.out.println(method(line));
            }
        }
    public static String method(String line){
        int a = Integer.parseInt(line);
        if (a == 0){
                return "NOW";
        } else if (a < 60){
                return a + " seconds";
        } else if (a < 3600){
                return a/60 + " minutes " + (a%60) + " seconds";
        } else if (a < 86400){
                return a/3600 + " hours " + (a%3600)/60 + " minutes " + (a%60) + " seconds";
        } else {
                return a/86400 + " days " + (a%86400)/3600 + " hours " + (a%3600)/60 + " minutes " + (a%60) + " seconds";
        }
    }
}
