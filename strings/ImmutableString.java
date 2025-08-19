public class ImmutableString {
    public static void main(String[] args) {
        String string= "java";
       // string.append("program"); beacause string are immutable
        System.out.println(string);
        String newstring= string.concat("program");
        System.out.println(newstring);
        string.toUpperCase();
        System.out.println(string);// this string did not converted to uppercase beacause string are immutable
        String uppercase= string.toUpperCase();
        System.out.println(uppercase);


    }
}
