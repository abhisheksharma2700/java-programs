public class CreateStringBuilder {
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder("hello");
        System.out.println(s);
        s.append(" java");
        System.out.println(s);
        s.insert(10," world");
        System.out.println(s);
        s.delete(10,16);
        System.out.println(s);


    }
}
