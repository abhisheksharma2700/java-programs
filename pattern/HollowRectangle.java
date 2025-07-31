
public class HollowRectangle{
  public static void main(String[]args){
   int k=4;
   int l=5;
   int i,j=0;
 for(i=1;i<=k;i++)
 {
   for(j=1;j<=l;j++){
   if(i==1|| i==k|| j==1||j==l)
   { System.out.print("*");
    }
   else{
   System.out.print(" ");
  }
  }
   System.out.println();
 }

}
}