public class Pattern7 {
    public static void main(String[] args) {
        Pattern7.pattern7(5);
    }
    static void pattern7(int n){
        for(int row=1; row<=n; row++)
        {
            int spaces = row-1;
            for(int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=n-row+1; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
