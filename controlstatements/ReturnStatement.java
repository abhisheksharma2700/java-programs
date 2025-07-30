package controlstatement;
class ReturnStatement
 {
    public int sum()
     { 
       int num1=10, num2=20;
       int res= num1+num2;
       return res;
      }
   public static void main(String[] args)
   { 
         ReturnStatement obj= new ReturnStatement();
         int result = obj.sum();
         System.out.println(result);
       }
  }