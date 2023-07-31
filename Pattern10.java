public class Pattern10 {
    public static void main(String[] args) {
        pattern10(5);
    }
    static void pattern10(int n)
    {
        for(int row=1; row<=n; row++)
        {
            int spaces = n - row;
            for(int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
