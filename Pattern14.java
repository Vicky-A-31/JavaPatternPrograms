public class Pattern14 {
    public static void main(String[] args) {
        pattern14(5);
    }
    static void pattern14(int n){
        for(int row=n; row>=1; row--)
        {
            int spaces = n-row;
            for(int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=2*row-1; col++)
            {
                if(row==1 || col==1 || row==n || col==2*row-1)
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
