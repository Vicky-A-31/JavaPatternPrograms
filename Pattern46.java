public class Pattern46 {
    public static void main(String[] args) {
        pattern46(6);
    }
    static void pattern46(int n){
        char alph2 = 'A';
        for(int row=1; row<=n; row++)
        {
            char alph = 'A';
            for(int col=1; col<=row; col++)
            {
                System.out.print(alph+" ");
                alph++;
            }
            System.out.print(" "+alph2+" ");
            for(int col=1; col<=row-1; col++)
            {
                System.out.print(alph2+" ");
                alph2--;
            }
            alph2 += row; // did'nt complete
            System.out.println();
        }
    }
}
