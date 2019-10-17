import java.util.*;
/**
 * Sort
 *
 * @author (Isabelle Cobb)
 * @version (10/17)
 */
public class Sort
{
    private static ArrayList<Integer>list = new ArrayList<Integer>();

    /**
     * Constructor for objects of class Sort
     */
    public Sort()
    {

    }

    public static void loadList(ArrayList<Integer> n, int v){
        System.out.print("Initial list: ");
        for(int i = 0; i<v; i++){
            n.add((int)(Math.random()*100)+1);
            System.out.print(n.get(i) + ", ");
        }
    }

    public static void sortList(ArrayList<Integer> x){
        System.out.println("\nSorted list: ");
        for(int i=x.size(); i>=0; i--){
            for(int j = 0; j<i ;j++){
                if(j < i-1){
                    if(x.get(j) > x.get(j+1)){
                        swapList(x,j);
                    }
                }
            }
        }

        for(int z = 0; z<x.size(); z++){
            System.out.print(x.get(z) + ", ");
        }
        
    }

    public static void swapList(ArrayList<Integer> y,int j){
        int temp = y.get(j+1);
        y.set(j+1, y.get(j));
        y.set(j, temp);
    }

    public static void main(){
        loadList(list, 10000);
        sortList(list);
    }
}

