public class Pattern38 {
    public static void main(String[] args) {
        pattern38(6);
    }
    static void pattern38(int n){
        int alph = 65;
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print((char) alph+" ");
            }
            alph++;
            System.out.println();
        }
    }
}
