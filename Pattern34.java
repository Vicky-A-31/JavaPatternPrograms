public class Pattern34 {
    public static void main(String[] args) {
        pattern34(5);
    }
    static void pattern34(int n){
        int ascii = 69;
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=n-row+1; col++)
            {
                System.out.print((char) ascii+" ");
                ascii--;
            }
            ascii = ascii+n-row;
            System.out.println();
        }
    }
    
}
