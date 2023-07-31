public class Pattern3 {
    public static void main(String[] args) {
        Pattern3.pattern3(5);
    }
    static void pattern3(int n){
        for(int row=1;row<=n;row++)
        {
            // using increment loop only 
            for(int col=1;col<=n-row+1;col++)   //using decrement loop 
            // for(int col=n; col<=row ;col--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
