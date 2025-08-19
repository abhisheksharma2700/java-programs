public class CompareStrings {
    public static void main(String[] args) {
        String s= "hello";
        String s1="hello";
        String s2= "Hello";
        String s3= "HeLLo";
        String s4= new String("hello");
        String s5= "world";
        String s6= "hello world";
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s3));

       System.out.println( s.equals(s4));
        System.out.println(s.equals(s5));
       System.out.println(s==s1);
       System.out.println(s==s2);
       System.out.println(s==s3);
       System.out.println(s==s4);
       System.out.println(s1==s5);

        System.out.println(s.compareTo(s1));
       System.out.println(s.compareTo(s2));
       System.out.println(s.compareTo(s3));
       System.out.println(s.compareToIgnoreCase(s4));
       System.out.println(s.compareTo(s5));

      // System.out.println(s6.startsWith("hello"));





      



    }
}
