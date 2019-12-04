package classes;

public class IntArrayWorker
{
    /** two dimensional matrix */
    private int[][] matrix = null;

    /** set the matrix to the passed one
     * @param theMatrix the one to use
     */
    public void setMatrix(int[][] theMatrix)
    {
        matrix = theMatrix;
    }

    /**
     * Method to return the total 
     * @return the total of the values in the array
     */
    public int getTotal()
    {
        int total = 0;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                total = total + matrix[row][col];
            }
        }
        return total;
    }

    /**
     * Method to return the total using a nested for-each loop
     * @return the total of the values in the array
     */
    public int getTotalNested()
    {
        int total = 0;
        for (int[] rowArray : matrix)
        {
            for (int item : rowArray)
            {
                total = total + item;
            }
        }
        return total;
    }

    /**
     * Method to fill with an increasing count
     */
    public void fillCount()
    {
        int numCols = matrix[0].length;
        int count = 1;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < numCols; col++)
            {
                matrix[row][col] = count;
                count++;
            }
        }
    }

    /**
     * print the values in the array in rows and columns
     */
    public void print()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                System.out.print( matrix[row][col] + " " );
            }
            System.out.println();
        }
        System.out.println();
    }

    /** 
     * fill the array with a pattern
     */
    public void fillPattern1()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; 
            col++)
            {
                if (row < col)
                    matrix[row][col] = 1;
                else if (row == col)
                    matrix[row][col] = 2;
                else
                    matrix[row][col] = 3;
            }
        }
    }

    public int getCount(int val){
        int count = 0;
        for(int r = 0; r< matrix.length;r++){
            for(int c = 0; c< matrix[r].length;c++){
                if(matrix[r][c] == val){
                    count++;
                }
            }
        }
        return count;
    }

    public int getLargest(){
        int largest = 0;
        for(int r = 0; r< matrix.length;r++){
            for(int c = 0; c< matrix[r].length;c++){
                if(matrix[r][c] > largest){
                    largest = matrix[r][c];
                }
            }
        }
        return largest;
    }

    public int getColTotal(int col){
        int sum = 0;
        for(int r = 0; r< matrix.length;r++){
            for(int c = col; c< col+1;c++){
                sum+=matrix[r][col];
            }
        }

        return sum;
    }

    public void loadEvensOdds(int[][] a){
        for(int r=0;r<a.length; r++){
            //load left with evens
            for(int c=0;c< a[r].length/2; c++){
                a[r][c] = (int)(Math.random()*9)+1;
                while(a[r][c]%2 !=0){
                    a[r][c] = (int)(Math.random()*9)+1;
                }
            }

            //load right with odds
            for(int c=a[r].length/2;c< a[r].length; c++){
                a[r][c] = (int)(Math.random()*9)+1;
                while(a[r][c]%2 ==0){
                    a[r][c] = (int)(Math.random()*9)+1;
                }
            }
        }

        for(int p=0;p<a.length; p++){
            for(int i=0;i< a[p].length; i++){
                System.out.print(a[p][i]+", ");

            }
            System.out.println();
        }
    }

    public void swap(int[] c, int index1, int index2){
        int temp = c[index1];
        c[index1] = c[index2];
        c[index2] = temp;
    }
    
    public void flipVertical(int[][] a){
        System.out.println("Flipped 2DArray: ");
        for(int r=0;r<a.length; r++){
            for(int c=0;c< a[r].length/2; c++){
                swap(a[r], c, a.length-1-c);
            }
        }
        
        for(int p=0;p<a.length; p++){
            for(int i=0;i< a[p].length; i++){
                System.out.print(a[p][i]+", ");

            }
            System.out.println();
        }
    }

    public static void main(){
        int[][] arr = new int[10][10];
        IntArrayWorker run = new IntArrayWorker();
        run.loadEvensOdds(arr);
        run.flipVertical(arr);
    }
}