
/**
 * NestedLoops
 *
 * @author (Isabelle Cobb)
 * @version (9/18)
 */
public class NestedLoops
{

    /**
     * Constructor for objects of class NestedLoops
     */
    public NestedLoops()
    {

    }

    public static void exampleA(){
        int num = 1;
        for(int r = 0; r<5;r++){
            for(int c = 0; c<=r;c++){
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
    }

    public static void exampleB(){
        int num2 = 5;
        for(int r=4; r>0; r--){
            for(int c=0; c<8;c++){
                System.out.print(num2);
            }
            num2--;
            System.out.println();
        }
    }

    public static void exampleC(int n){
        if(n==2){
            for(int r=0; r < n;r++){
                for(int c=0; c < n;c++){
                    System.out.print(n+" ");
                }
                System.out.println();
            }
        }

        if(n==3){
            for(int r=0; r < n;r++){
                for(int c=0; c < n;c++){
                    System.out.print(n+" ");
                }
                System.out.println();
            }
        }

        if(n==6){
            for(int r=0; r < n;r++){
                for(int c=0; c < n;c++){
                    System.out.print(n+" ");
                }
                System.out.println();
            }
        }
    }

    public static void exampleD(int n){
        if(n==7){
            int d = 1;
            for(int r=0; r < 7;r++){
                for(int c=7-r; c > 0;c--){
                    System.out.print("-");
                }
                System.out.println(d);
                d++;
            }
        }
    }

    public static void exampleE(){
        for(int r=0; r < 7;r++){
            for(int c=6; c > r;c--){
                System.out.print(" ");
            }

            for(int s=0; s<=r;s++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void exampleF(){
        //top half of diamond

        for(int r=0; r < 7;r++){
            for(int c=6; c > r;c--){
                System.out.print(" ");
            }

            for(int s=0; s<(2*r+1);s++){
                System.out.print("*");
            }

            System.out.println();
        }

        //bottom half of diamond
        for(int a=0; a < 6;a++){
            for(int q=0; q <= a;q++){
                System.out.print(" ");
            }

            for(int t=11-a; t>a;t--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
    public static void exampleGTop(){
        for(int a=0; a<4;a++){

            System.out.print("|");
            for(int b=8; b>a; b--){
                System.out.print(" ");
            }
            for(int c=0; c<a;c++){
                System.out.print("/");
            }

            System.out.print("+");

            for(int c=0; c<a;c++){
                System.out.print("\\");
            }
            for(int b=8; b>a; b--){
                System.out.print(" ");
            }

            System.out.println("|");
        }

    }

    public static void exampleGBottom(){
        for(int a=3; a>-1;a--){

            System.out.print("|");
            for(int b=8; b>a; b--){
                System.out.print(" ");
            }
            for(int c=0; c<a;c++){
                System.out.print("\\");
            }

            System.out.print("+");

            for(int c=0; c<a;c++){
                System.out.print("/");
            }
            for(int b=8; b>a; b--){
                System.out.print(" ");
            }

            System.out.println("|");
        }
    }
    
    public static void exampleG(){
        //prints top of box
        System.out.print("+ ");
        for(int a=0; a<8; a++){
            System.out.print("- ");
        }
        System.out.println("+");
        
        //prints diamond
        exampleGTop();
        exampleGBottom();
        
        //prints bottom of box
        System.out.print("+ ");
        for(int a=0; a<8; a++){
            System.out.print("- ");
        }
        System.out.println("+");
        
        //prints diamond bottom then top
        exampleGBottom();
        exampleGTop();
        
        //prints bottom of box
        System.out.print("+ ");
        for(int a=0; a<8; a++){
            System.out.print("- ");
        }
        System.out.println("+");
    }

}
