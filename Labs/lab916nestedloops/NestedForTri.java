//© A+ Computer Science
// www.apluscompsci.com

//nested for loop example

public class NestedForTri
{
   public static void main(String args[])
   {

/*
            *
            **
            ***
            ****
            *****
            ******
            *******
            ********
            *********
        */

        int stop=8;
        for(int r=0;r<=stop;r++){
            for(int c=0;c<=r;c++){
                System.out.print("*");
              }
              System.out.println();
          }
        
        //add in a for loop to print the rows   //rows
           //add in a for loop to print out the * on each row  //columns
              
           //print out a new line


    }
}