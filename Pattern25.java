public class Pattern25 {
    public static void main(String[] args) {
        pattern25(5);
    }
    static void pattern25(int n){
        for(int row=1; row<=n; row++)
        {
            int spaces = n-row;
            for(int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=n; col++)
            {
                if(row==1 || col==1 || row==n || col==n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
