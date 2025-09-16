//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

interface Drawable{
    void draw();
}

public class FunctionalInterfaces {
    public static void main(String[] args) {
        int l= 10;
        Drawable d= new Drawable()
        {

            public void draw() {
                System.out.println("functional interfaces without lamda function "+l);

            }
        };
        d.draw();



    }
}