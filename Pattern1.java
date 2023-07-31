public class Pattern1 {
    public static void main(String[] args) {
        Pattern1.pattern1(5);
    }
    
    static void pattern1(int n){
        for(int row=1;row<=5;row++)
        {
            for(int col=1;col<=5;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
