package pattern;
public class UppositeInvertedHalfPyaramid
 {
   public static void main(String[]args)
    {
      int number=5;
      int i,j=1;
      for(i=1;i<=number;i++)
       {
         for(j=1;j<=number-i;j++)
         {
           System.out.print(" ");
          }
           for(j=1;j<=i;j++)
           {
             System.out.print("*");
            }
            System.out.println();
         }
     }
   }