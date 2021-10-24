import java.util.*;
public class aryaknow
{
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        aryaknow b = new aryaknow();
        int p = n.nextInt();
        int t = n.nextInt();
        b.who(p,t);
    }
    //x -- Arya
    //y -- Margaret
    public void who(int x, int y){
        if(x == y){
            System.out.println("Depends on who starts");
        }else{
            if(x<y){
                System.out.println("Arya will think of something else");
            }else{
                if(x>y){
                    System.out.println("Margaret will think of something else");
                }
            }
        }
    }
}
