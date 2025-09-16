import java.util.*;
interface Show{
    public void display(int a);
    int hashCode();
    String toString();
    boolean equals( Object obj );


}

public class Example8 implements Show{
  public void display(int a){
      System.out.println(a);
  }
  public static void main(String[]args){
      Example8 e= new Example8();
      e.display(10);
    }

}
