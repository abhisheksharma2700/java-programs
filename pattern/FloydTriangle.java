package pattern;
public class FloydTriangle
 {
  public static void main(String[]args)
   {
     int i,j=0;
     int count=1;
     int number=5;
     for(i=1;i<=number;i++)
     {
       for(j=1;j<=i;j++)
       {
         System.out.print(count+" ");
         count++;
        }
        System.out.println();
       }
   }
 }
