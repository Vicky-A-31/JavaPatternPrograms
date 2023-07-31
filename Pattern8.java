public class Pattern8 {
    public static void main(String[] args) {
        pattern8(5);
    }
    static void pattern8(int n){
        for(int row=1; row<=5; row++)
        {
            int spaces = n-row;
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
