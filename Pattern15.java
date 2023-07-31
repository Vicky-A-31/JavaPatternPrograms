public class Pattern15 {
    public static void main(String[] args) {
        pattern15(5);
    }
    static void pattern15(int n){
        for(int row=1; row<=2*n-1; row++)
        {
            int size = (row>n) ? 2*n-row : row;
            int spaces = n-size;
            for(int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=size; col++)
            {
                if(row==1 || col==1 || row==2*n-1 || col==size)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
