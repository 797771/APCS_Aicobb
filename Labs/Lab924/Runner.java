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

        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");

            inputStr = kb.nextLine();
            System.out.println(inputStr);

            if(!inputStr.equals("quit")){
                Person p = new Person(inputStr);

                //loads person objects into an array
                for(int i = 0; i<personArray.length; i++){
                    personArray[i] = p;

                }

                
            }
        }

    }

    //extends 1st array of names
    public Person[] extendArray(Person[] personArray, int n){
        Person[] personArray2 = new Person[personArray.length + n];
        
        for(int i=0;i<personArray.length; i++){
            personArray2[i] = personArray[i];
        }

        return personArray2;
    }

    //prints array of names
    public void printNames(Person[] personArray){

            for(int i = 0;i<personArray.length;i++){
                System.out.print(personArray[i]+ ", ");
            }
        


    }
    
}

