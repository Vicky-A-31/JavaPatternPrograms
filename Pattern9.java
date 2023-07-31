public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }
    static void pattern9(int n){
        for(int row=n; row>=1; row--)
        {
            int spaces = n - row;
            for(int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=2*row-1; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
