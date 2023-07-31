public class Pattern42 {
    public static void main(String[] args) {
        pattern42(6);
    }
    static void pattern42(int n){
        for(int row=1; row<=n; row++)
        {
            int colsize = n-row ;
            for(int k=1; k<=colsize; k++)
            {
                System.out.print(" ");
            }
            
            char alph = 'A';
            for(int col=1; col<=row; col++)
            {
                System.out.print(alph+" ");
                alph++;
            }
            System.out.println();
        }
    }
}
