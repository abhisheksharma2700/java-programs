package pattern;
public class NumberPattern
 {
    public static void main(String[]args)
   {
     int i,j=0;
     int number=5;
     for(i=1;i<=number;i++)
     {
       for(j=1;j<=i;j++)
       {
         System.out.print(j);
      
       }
       System.out.println();
      }
  }
 }