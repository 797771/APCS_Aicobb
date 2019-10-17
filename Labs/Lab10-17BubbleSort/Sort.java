import java.util.*;
/**
 * Sort
 *
 * @author (Isabelle Cobb)
 * @version (10/17)
 */
public class Sort
{
    private ArrayList<Integer>list = new ArrayList<Integer>(10000);

    /**
     * Constructor for objects of class Sort
     */
    public Sort()
    {
        loadList(list);
        sortList(list);
    }

    public void loadList(ArrayList<Integer> n){
        for(int i =0; i<n.size(); i++){
            n.add((int)(Math.random()*100)+1);
            System.out.print("Initial list: " + n.get(i) + ", ");
        }
    }

    public void sortList(ArrayList<Integer> x){
        for(int i = 0; i<x.size(); i++){
            for(int j = 0; j < x.size();j++){
                if(x.get(j)> x.get(j+1)){
                    swapList(x, i, j);
                }
            }
        }
        
        for(int z = 0; z<x.size(); z++){
            System.out.print("Sorted list: " + x.get(z) + ", ");
        }
    }
    
    public void swapList(ArrayList<Integer> y, int i, int j){
        int temp = y.get(i);
        y.set(i, y.get(j));
        y.set(j, temp);
    }

    public static void main(){
        Sort run = new Sort();
    }
}

