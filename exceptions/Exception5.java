public class Exception5 {
    public static void main(String[]args){
        int []a= new int[5];
        try{
            System.out.println( a[10]);
        }
        catch(ArithmeticException e){
            System.out.println("airthmatic exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index is out of bound"+e);
        }
        catch(Exception e){
            System.out.println("input output exception");
        }

    }
}
