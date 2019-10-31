import java.util.*;
/**
 * StringCheck
 *
 * @author (Isabelle Cobb)
 * @version (10/31/19)
 */
public class StringCheck
{
    /**
     * Constructor for objects of class StringCheck
     */
    public StringCheck()
    {

    }

    public static void main(){
        Scanner kb = new Scanner(System.in);
        ArrayList<String> orig = new ArrayList<String>();
        System.out.println("Type in a list of words, entering each word after you type it.\nWhen you are done entering words, enter \"done\" and input a key word.");
        String inputStr = "";
        String kWord = "";
        while(!inputStr.equals("done")){
            inputStr = kb.nextLine();
            orig.add(inputStr);
        }
        if(inputStr.equals("done")){
            System.out.print("Now enter a key word: ");
            String inputKey = kb.nextLine();
            kWord = inputKey;
        }

        String[] wordC = new String[orig.size()];
        for(int i =0; i <orig.size();i++){
            wordC[i] = orig.get(i);
        }

        wordChecker(wordC, kWord);
        wordChecker(orig, kWord);

    }

    //array into an arraylist
    public static ArrayList<String> wordChecker(String[] str, String key){
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<str.length;i++){
            if(str[i].indexOf(key)!=-1){
                list.add(str[i]);
            }
        }
        System.out.print("\nArray in, ArrayList out: ");
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i) + ", ");
        }
        return list;
    }

    //arraylist into an array
    public static String[] wordChecker(ArrayList<String> str, String Key){
        String[] list2 = new String[str.size()];
        for(int i = 0; i<str.size(); i++){
            if(str.get(i).indexOf(Key)!=-1){
                list2[i] = (str.get(i));
            }
        }

        System.out.print("\nArrayList in, Array out: ");
        for(int i = 0;i<list2.length;i++){
            if(list2[i] != null){
                System.out.print(list2[i] + ", ");
            }
        }
        return list2;
    }

}
