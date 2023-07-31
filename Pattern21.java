public class Pattern21 {
    public static void main(String[] args) {
        Pattern21.pattern21(5);
    }
    static void pattern21(int n){
        int num=1;
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

