public class Pattern27 {
    public static void main(String[] args) {
        pattern27(4);
    }
    static void pattern27(int n){
        int count = 1;
        int num = 17;
        for(int row=1; row<=n; row++)
        {
            for(int k=1; k<=row-1; k++)
            {
                System.out.print("  ");
            }
            for(int col=1; col<=n-row+1; col++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.print(" ");
            for(int col=1; col<=n-row+1; col++)
            {
                System.out.print(num+" ");
                num++;
            }
            num -= 2*(n-row)+1;
            System.out.println();
        }
    }
}
