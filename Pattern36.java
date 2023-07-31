public class Pattern36 {
    public static void main(String[] args) {
        pattern36(6);
    }
    static void pattern36(int n){
        for(int row=1; row<=n; row++)
        {
            for(int col=row; col<=n; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=2; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
