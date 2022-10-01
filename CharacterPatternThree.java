public class CharacterPatternThree {
    public static void main(String[] args) {
        char i,j,count='A' ;
        for(i='A' ;i<='E' ;i++)  //row
        {
            for(j='A' ; j<=i ; j++)  //columb n pattern
            {
                System.out.print(count + " ");
                count++ ;
            }
            System.out.print("\n");
        }
    }
}
