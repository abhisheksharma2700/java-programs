package pattern;
public class InvertedHalfPyaramidWithNumbers
 {
   public static void main(String[]args)
  {
    int i,j;
    int number=5;
    for(i=0;i<=number;i++)
    {
      for(j=1;j<=number-i;j++)
      { System.out.print(j);
       }
       System.out.println();
      }
}
}
    