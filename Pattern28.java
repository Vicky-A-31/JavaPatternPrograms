public class Pattern28 {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern28(int n)
    {
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
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
