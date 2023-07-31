public class Pattern44 {
    public static void main(String[] args) {
        pattern44(6);
    }
    static void pattern44(int n)
    {
        for(int row=1; row<=n; row++)
        {
            char alph = 'F';
            for(int col=1; col<=row; col++)
            {
                System.out.print(alph+" ");
                alph--;
            }
            System.out.println();
        }
    }
}
