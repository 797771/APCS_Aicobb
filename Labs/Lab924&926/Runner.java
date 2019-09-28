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

        Person[] personArray = new Person[2];
        Person[] newPersonArray = personArray;
        int i = 0;

        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");

            inputStr = kb.nextLine();
            System.out.println(inputStr);

            if(!inputStr.equals("quit")){
                Person p = new Person(inputStr);

                //loads person objects into an array
                newPersonArray[i++] = p;
                printNames(newPersonArray);

                if(personArray[personArray.length-1] != null){
                    System.out.println("\nWould you like to add more names? Enter \"yes\" or \"no\".");
                    inputStr = kb.nextLine();
                    
                    if(inputStr.equals("yes")){
                        newPersonArray = extendArray(personArray, 10);
                    }

                }
            }
        }

    }

    //extends 1st array of names
    public static Person[] extendArray(Person[] personArray, int n){
        Person[] personArray2 = new Person[personArray.length + n];

        for(int i=0;i<personArray.length; i++){
            personArray2[i] = personArray[i];
        }

        return personArray2;
    }

    //prints array of names
    public static void printNames(Person[] newPersonArray){
        System.out.print("\nArray of names: ");

        for(int i = 0;i<newPersonArray.length;i++){
            System.out.print(newPersonArray[i].fName + " " + newPersonArray[i].mName + " " + newPersonArray[i].lName + ", ");
        }

    }

}

