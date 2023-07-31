public class Pattern35 {
    public static void main(String[] args) {
        pattern35(4);
    }
    static void pattern35(int n){
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print(col);
            }
            for(int k=1; k<=2*(n-row); k++)
            {
                System.out.print(" ");
            }
            for(int col=row; col>=1; col--)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
