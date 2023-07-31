public class Pattern13 {
    public static void main(String[] args) {
        pattern13(5);
    } 
    static void pattern13(int n){
        for(int row=1; row<=n; row++)
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
