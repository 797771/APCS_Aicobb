/**
 * Runner
 *
 * @author (Isabelle Cobb)
 * @version (9/24)
 */

import java.util.Scanner;
public class Runner{
    static int obInArray = 0;
    
    public static void main(){

        Scanner kb = new Scanner(System.in);
        String inputStr = "";

        Person[] personArray = new Person[5];
        int i = 0;

        while(!inputStr.equals("quit")){
            System.out.println("\nEnter a name or type \"quit\" to quit");

            inputStr = kb.nextLine();
            System.out.println(inputStr);

            if(!inputStr.equals("quit")){
                Person p = new Person(inputStr);

                //loads person objects into an array
                obInArray++;
                personArray[i] = p;
                printNames(personArray);
                i++;

                if(personArray[personArray.length-1] != null){
                    System.out.println("\nWould you like to add more names? Enter \"yes\" or \"no\".");
                    inputStr = kb.nextLine();
                    
                    if(inputStr.equals("yes")){
                         personArray = extendArray(personArray, 10);
                    }

                }
            }
        }

    }

    //extends 1st array of names
    public static Person[] extendArray(Person[] pa1, int n){
        Person[] pa2 = new Person[pa1.length + n];

        for(int i=0;i<pa1.length; i++){
            pa2[i] = pa1[i];
        }

        return pa2;
    }

    //prints array of names
    public static void printNames(Person[] pa1){
        System.out.print("\nArray of names: ");

        for(int i = 0;i<obInArray;i++){
            System.out.print(pa1[i].fName + " " + pa1[i].mName + " " + pa1[i].lName + ", ");
        }

    }

}

