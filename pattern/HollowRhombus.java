package pattern;
public class HollowRhombus{
    public static void main(String[] args) {
        int number=5;
        int m=5;
        for (int i=1;i<=number; i++ ) {
            for(int j=1; j<=number-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=number;j++){
                if(i==1||i==m||j==1||j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                    
            }
                
        System.out.println();

           }
            
    }
}
    

