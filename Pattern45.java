public class Pattern45 {
    public static void main(String[] args) {
        pattern45(6);
    }
    static void pattern45(int n){
        char alph = 'A';
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print(alph+" ");
                alph++;
            }
            System.out.println();
        }
    }
}
