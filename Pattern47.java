public class Pattern47 {
    public static void main(String[] args) {
        pattern47(6);
    }
    static void pattern47(int n){
        for(int row=1; row<=2*n-1; row++)
        {
            char alph = 'A';
            int colsize = (row > n) ? 2*n-row : row;
            int spaces = (row > n) ? row-n : n-row;
            for(int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=colsize; col++)
            {
                System.out.print(alph+" ");
                alph++;
            }
            System.out.println();
        }
    }
}
