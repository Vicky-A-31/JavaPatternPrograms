public class Pattern12 {
    public static void main(String[] args) {
        pattern12(5);
    }
    static void pattern12(int n){
        for(int row=1; row<=2*n; row++)
        {
            int spaces = (row>n) ? 2*n-row : row-1;
            int size = (row>n) ? row-n : n-row+1;
            for(int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=size; col++)
            {
                System.out.print("* ");
            }       
        System.out.println();
        }
    }
}
