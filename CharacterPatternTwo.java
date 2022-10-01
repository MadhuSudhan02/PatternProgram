public class CharacterPatternTwo {
    public static void main(String[] args) {
        char i,j ;
        for(i='A' ;i<='E' ;i++)  //row
        {
            for(j='A' ; j<=i ; j++)  //columb n pattern
            {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
}
