public class Pattern43 {
    public static void main(String[] args) {
        pattern43(6);
    }
    static void pattern43(int n){
        for(int row=1; row<=n; row++)
        {
            char alph = 'F';
            for(int col=1; col<=n-row+1; col++)
            {
                System.out.print(alph+" ");
                alph--;
            }
            System.out.println();
        }
    }
}
