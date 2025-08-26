public class Exception3 {
    public static void main(String[]args){
        String s= "hello";
        try{
            int a= Integer.parseInt(s);
            System.out.println("string"+a);


        }
        catch(NumberFormatException e){
            System.out.println("string cannot be changed into integer"+e);

        }
        System.out.println("other running code");

    }
}
