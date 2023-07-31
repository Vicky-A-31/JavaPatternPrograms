public class Pattern37{
    public static void main(String[] args) {
        pattern37(6);
    }
    static void pattern37(int n){
        
        for(int row=1; row<=n; row++)
        {
            int alph = 65;
            for(int col=1; col<=row; col++)
            {
                System.out.print((char) alph+" ");
                alph++;
            }
            System.out.println();
        }
    }
}