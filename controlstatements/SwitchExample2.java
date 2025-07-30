package controlstatements;
public class SwitchExample2
 {
    public static void main(String[] args)
   {
      String day= "Monday";
      switch(day)
      {
        case "Monday":
           System.out.println("day 1");
           break;
        case "Tuesday":
           System.out.println("day 2");
           break;
        case "Wednesday":
           System.out.println("day 3");
           break;
        case "Thursday":
           System.out.println("day 4");
           break;
        case "Friday" :
           System.out.println("day 5");
           break;
         case "Saturday" :
            System.out.println("day 6");
            break;
         case "Sunday" :
            System.out.println("day 7");
            break;
         default:
            System.out.println("Invalid day");
        }
    }
 }
    