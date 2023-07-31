public class Pattern29 {
    public static void main(String[] args) {
        pattern29(5);
    }
    static void pattern29(int n){
        for(int row=1; row<=2*n-1; row++)
        {
            int size = (row>n) ? 2*n-row : row;
            int spaces = (row>n) ? 2*(row-n) : 2*(n-row);

            // printing stars in the left side
            for(int col=1; col<=size; col++)
            {
                System.out.print("*");
            }

            // printing spaces
            for(int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }

            // printing stars in the right side
            for(int col=1; col<=size; col++)
            {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }
}
