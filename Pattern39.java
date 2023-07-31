public class Pattern39 {
    public static void main(String[] args) {
        pattern39(6);
    }
    static void pattern39(int n){
        for(int row=1; row<=2*n-1; row++)
        {
            int alph = 65;
            int colsize = (row > n) ? 2*n-row : row ;
            for(int col=1; col<=colsize; col++)
            {
                System.out.print((char) alph+" ");
                alph++;
            }
            System.out.println();
        }
    }
}
