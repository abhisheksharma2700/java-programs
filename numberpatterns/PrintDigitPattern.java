
package numberpatterns;
import java.util.Scanner;

public class PrintDigitPattern {
    public static void PrintDigit(long digit, int row){
        int length=7;
        int num= (int) digit;
        switch(num){
            case 0:
                if(row==0|| row==6){
                for(int i=1; i<=length; i++){
                System.out.print("*");
                }
            }
                else{
                    System.out.print("*");
                    for(int j=1;j<=length-2;j++ ){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                
                 }
                 break;
            case 1:
                  if(row==0||row==3|| row==6){
                    System.out.print("*");
                  }
                  else{
                    System.out.print("*");
                  }
                 break;
            case 2:
                 if(row==0|| row==3 ||row==6){
                    for(int i=1;i<=length;i++){
                        System.out.print("*");
                    }

                 }
                  if(row==1||row==2){
                    for(int i=1;i<=length-1;i++){
                        System.out.print(" ");

                    }
                    System.out.print("*");

                 }
                 if(row==4||row==5) {
                    System.out.print("*");
                    for(int i=1;i<=length-1;i++){
                        System.out.print(" ");
                    }
                 }
                 break;
            case 3:
                if(row==0||row==3||row==6){
                    for(int i=1;i<=length;i++){
                        System.out.print("*");
                    }
                }
                 else{
                    for(int i=1;i<=length-1;i++){
                    System.out.print(" ");
                    }
                    System.out.print("*");
                 }
                 break;
            case 4:
                if(row==0||row==1){
                    System.out.print("*");
                    for(int i=1;i<=length-2;i++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                else if(row==2){
                    for(int i=1;i<=length;i++){
                        System.out.print("*");
                    }

                }
                else{
                    for(int i=1;i<=length-1;i++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                break;
            case 5:
                if(row==0|| row==3 || row==6){
                    for(int i=1;i<=length;i++){
                        System.out.print("*");
                    }
                }
                else if(row==1|| row==2){
                    System.out.print("*");
                    for(int i=1;i<=length-1;i++){
                        System.out.print(" ");
                    }
                }
                else{
                    for(int i=1;i<=length-1;i++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                break;
            case 6:
                if(row==0|| row==3|| row==6){
                    for(int i=1;i<=length;i++){
                        System.out.print("*");
                    }
                
                }
                else if(row==1||row==2){
                    System.out.print("*");
                    for(int i=1;i<=length-1;i++){
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print("*");
                    for(int i=1;i<=length-2;i++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                break;
            case 7:
               if(row==0){
                for(int i=1;i<=length;i++){
                    System.out.print("*");
                }
               }
               else{
                for(int i=1;i<=length-1;i++){
                    System.out.print(" ");

                }
                System.out.print("*");
               }
               break;
            case 8:
                if(row==0||row==3||row==6){
                    for(int i=1;i<=length;i++){
                        System.out.print("*");
                    }
                
                }
                else{
                    System.out.print("*");
                    for(int i=1;i<=length-2;i++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                break;
            case 9:
               if(row==0|| row==3|| row==6){
                for(int i=1;i<=length;i++){
                    System.out.print("*");
                }
               }
               else if(row==1|| row==2){
                System.out.print("*");
                for(int i=1;i<=length-2;i++){
                    System.out.print(" ");
                }
                System.out.print("*");
               }
               else{
                for(int i=1;i<=length-1;i++){
                    System.out.print(" ");
                }
                System.out.print("*");
               }
               break;
        }

    }
       public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        long number= sc.nextLong();
        //int number = (int)longnumber;
        sc.close();
         long d1=(number/1000000000)%10;
         long d2=(number/100000000)%10;
         long d3=(number/10000000)%10;
         long d4=(number/1000000)%10;
         long d5=(number/100000)%10;
         long d6=(number/10000)%10;
         long d7=(number/1000)%10;
         long d8=(number/100)%10;
         long d9=(number/10)%10;
         long d10=number%10;

          for(int row=0; row<=6;row++){

            PrintDigit(d1,row);
            System.out.print("  ");
            PrintDigit(d2,row);
            System.out.print("  ");
            PrintDigit(d3,row);
            System.out.print("  ");
            PrintDigit(d4,row);
            System.out.print("  ");
            PrintDigit(d5,row);
            System.out.print("  ");
            PrintDigit(d6,row);
            System.out.print("  ");
            PrintDigit(d7,row);
            System.out.print("  ");
            PrintDigit(d8,row);
            System.out.print("  ");
            PrintDigit(d9,row);
            System.out.print("  ");
            PrintDigit(d10,row);
            System.out.println();
           }

    }
    
}
