public class Pattern40 {
    public static void main(String[] args) {
        pattern40(6);
    }
    static void pattern40(int n){
        for(int row=1; row<=n; row++)
        {
            char alph = 'A';
            for(int col=1; col<=n-row+1; col++)
            {
                System.out.print(alph+" ");
                alph++;
            }
            System.out.println();
        }

        for(int row=1; row<=n; row++)
        {
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
