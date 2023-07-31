public class Pattern33 {
    public static void main(String[] args) {
        pattern33(5);
    }
    static void pattern33(int n){
        int alph = 65;
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                if((row+col)%2==0)
                {
                    char lowercase = (char) alph;
                    System.out.print(Character.toLowerCase(lowercase)+" ");
                }
                else
                {
                    char uppercase = (char) alph;
                    System.out.print(Character.toUpperCase(uppercase)+" ");
                }
                alph++;
            }
            System.out.println();
        }
    }
}

