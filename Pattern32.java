public class Pattern32 {
    public static void main(String[] args) {
        pattern32(5);
    }
    static void pattern32(int n){
        int alph = 69;
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print((char) alph+" ");
                alph++;
            }
            alph -= row+1;
            System.out.println();
        }
    }
}
