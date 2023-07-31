public class Pattern48 {
    public static void main(String[] args) {
        pattern48(6);
    }
    static void pattern48(int n){
        for(int row=1; row<=n; row++)
        {
            int alphabet = 65;
            for(int k=1; k<=n-row; k++)
            {
                System.out.print(" ");
            }
            int x= 1;
            for(int col=1; col<=row; col++)
            {
                char a = (char) (alphabet - 1 + x);
                System.out.print(a+" ");
                x = x * (row-col) / col;
            }
            System.out.println();
        }
    }
}
