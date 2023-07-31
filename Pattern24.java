public class Pattern24 {
    public static void main(String[] args) {
        pattern24(5);
    }
    static void pattern24(int n){
        for(int row=1; row<=2*n-1; row++)
        {
            int size = (row>n) ? 2*n-row : row;
            int spaces = (row>n) ? 2*(row-n) : 2*(n-row);

            // printing stars in the left side
            for(int col=1; col<=size; col++)
            {
                if(row==1 || col==1 || row==2*n-1 || col==size)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            // printing spaces
            for(int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }

            // printing stars in the right side
            for(int col=1; col<=size; col++)
            {
                if(row==1 || col==1 || row==2*n-1 || col==size)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            // move to next line
            System.out.println();
        }
    }
}
