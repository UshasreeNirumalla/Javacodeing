import java.util.Scanner;
import java.math.*;
public class Switch {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int val=sc.nextInt();
        switch (val) {
            case 1:
                System.out.print(Math.sqrt(4)); 
                break;
            case 2:
                 System.out.println(Math.min(2,3));
                 break;
            case 3:
                  System.out.println(Math.max(2,3));
                  break;
            case 8:
                 System.out.println(Math.round(2.1));
                 break;
            case 4:
                  System.out.println(Math.min(2,3));
                  break;
            case 5:
                  System.out.println(Math.sqrt(2));
                  break;
            case 6:
                 System.out.println(Math.pow(2,4));
                 break;
            case 7:
                 System.out.println(Math.abs(2));
                 break;
            default:
                System.out.println("enter correct");
                break;
        }
        }
    }

