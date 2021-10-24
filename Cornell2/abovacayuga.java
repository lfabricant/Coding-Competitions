import java.util.*;

/**
 * Write a description of class abovecayuga here.
 *
 * @author (Roslyn Rockstars)
 * @version (2021)
 */
public class abovecayuga
{
    //ArrayList<Integer> coords = new ArrayList<>();
    public static List<ArrayList<Integer>> coordys = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        for(int i = 0; i < Integer.valueOf(num); i++){
            String b = sc.nextLine();
            
            addCoord(b);
        }
        System.out.println(tris(coordys));
    }
    
    public static void addCoord(String line){
        ArrayList<Integer> abc = new ArrayList<>();
        String[] splitt = line.split(" ");
        
        for(int i = 0; i < splitt.length; i++){
            //int ack = Integer.valueOf(splitt[i]);
            //System.out.println(splitt.length);
            //System.out.println(Integer.valueOf(splitt[i]));
            abc.add(Integer.parseInt(splitt[i]));
            
        }
        coordys.add(abc);
    }
    
    public static double slope1(ArrayList<Integer> a1, ArrayList<Integer> a2){
        double nD = 0;
        if((a1.get(0)-a2.get(0)) != 0){
            nD = (a1.get(1) - a2.get(1)) / (a1.get(0)-a2.get(0));
        } 
        return nD;
    }
    
    public static boolean triWork(ArrayList<Integer> a1, ArrayList<Integer> a2, ArrayList<Integer> a3){
        if(slope1(a1, a2) != slope1(a2, a3) && slope1(a2, a3) != slope1(a1, a3)){
            return true;
        }
        return false;
    }
    
    public static int tris(List<ArrayList<Integer>> abc){
        int numT = 0;
        int indexA = 0;
        int indexB = 0;
        int indexC = 0;
        for(int i = 0; i < abc.size(); i++){
            //System.out.println("POINT: " + abc.get(i));
            if(i < abc.size()-2){
                //System.out.println("1");
                indexA = i;
                indexB = i+1;
                indexC = i+2;
            } else if (i == abc.size()-2){
                //System.out.println("2");
                indexA = i;
                indexB = i+1;
                indexC = 0;
            } else {
                //System.out.println("3");
                indexA = i;
                indexB = 0;
                indexC = 1;
            }
            //System.out.println(abc.get(indexA));
            //System.out.println(abc.get(indexB));
            //System.out.println(abc.get(indexC));
            if(triWork(abc.get(indexA), abc.get(indexB), abc.get(indexC))){
                numT++;
                i=i+2;
                //System.out.println(i);
            } 
        }
        
        return numT;
    }
}
