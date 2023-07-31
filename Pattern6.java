public class Pattern6 {
    public static void main(String[] args) {
        Pattern6.pattern6(5);
    }
    static void pattern6(int n){
        for(int row=1; row<=n; row++)
        {
            int spaces = n - row;
            for(int k=1; k<=spaces; k++) // before * printing, provide the spaces using this loop
            {
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
