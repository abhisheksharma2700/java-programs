

public class NinePattern2 {
    public static void main(String[] args) {
        int length=7;
        int mid = length/2;
        for(int i=1;i<=length;i++){
            System.out.print("*");

        }
        System.out.println();
        for(int i=1;i<=mid;i++){
            System.out.print("*");
            for(int j= 1;j<=length-2;j++){
                System.out.print(" ");

            }
            System.out.println("*");

        }
        for(int i=1;i<=length;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<=mid;i++){
            for(int j=1;j<=length-1;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=1;i<=length;i++){
            System.out.print("*");

        }

    }
    
}
