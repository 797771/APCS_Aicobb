/**
 * Runner
 *
 * @author (Isabelle Cobb)
 * @version (9/24)
 */

import java.util.Scanner;
public class Runner{

    public static void main(){

        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            System.out.println(inputStr);
            if(!inputStr.equals("quit")){
                Person p = new Person(inputStr);
            }
        }

    }
}
