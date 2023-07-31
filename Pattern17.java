public class Pattern17 {
    public static void main(String[] args) {
        pattern17(4);
    }
    static void pattern17(int n){
        for(int row=1; row<=2*n-1; row++)
        {
            int spaces = (row>n) ? row-n : n-row ;
            int size = (row>n) ? 2*n-row : row ; 
            for(int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            for(int col=size; col>=1; col--)
            {
                System.out.print(col);
            }
            for(int col=2; col<=size; col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
