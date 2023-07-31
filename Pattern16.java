public class Pattern16 {
    public static void main(String[] args) {
        pattern16(5);
    }
    static void pattern16(int n){
        for(int row=1; row<=n; row++)
        {
            for(int k=1; k<=n-row; k++)
            {
                System.out.print(" ");
            }
            int x=1;
            for(int col=1; col<=row; col++)
            {
                System.out.print(x+" ");
                x = x * (row - col) / col;
            }
            System.out.println();
        }
    }
}
