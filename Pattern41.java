public class Pattern41 {
    public static void main(String[] args) {
        pattern41(6);
    }
    static void pattern41(int n){
        int alph = 70;
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=n-row+1; col++)
            {
                System.out.print((char) alph+" ");
                alph--;
            }
            alph += n- row;
            System.out.println();
        }

        int Alph = 65;
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print((char) Alph+" ");
                Alph--;
            }
            Alph += row+1;
            System.out.println();
        }
    }
}
