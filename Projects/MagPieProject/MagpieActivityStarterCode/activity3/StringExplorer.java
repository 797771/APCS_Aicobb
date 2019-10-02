package MagpieActivityStarterCode.activity3;

/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Isabelle Cobb
 * @version 10/2/19
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println ("sample.indexOf(\"quick\") = " + position);

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println ("sample.toLowerCase() = " + lowerCase);
        System.out.println ("After toLowerCase(), sample = " + sample);

        //  Try other methods here:
        int notFoundPen = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPen);

        int newIndexOfFunc = sample.indexOf("o", 13);//this indexOf function finds index of given string after index value given
        System.out.println("sample.newIndexOfFunc(\"o\") = " + newIndexOfFunc);

    }

}
