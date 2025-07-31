//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TrianglePattern{
    public static void main(String[]args){
        int number=10;
        for(int i=1;i<=number;i++){
           
            for(int j=1;j<=number-i;j++){
                System.out.print(" ");


            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}