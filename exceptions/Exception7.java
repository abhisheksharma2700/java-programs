public class Exception7{
    public static void main(String[] args) {
         
         try{
          int a= 10/0;
          System.out.println(a);
        }
        catch(ArithmeticException e){
          System.out.println("airthmatic exception");
        }
        catch(Exception e){
          System.out.println("parent exception");
        }
        
        finally{
          System.out.println("20");
        }
        }
           
    }

