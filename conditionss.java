import java.util.Scanner;
public class conditionss {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number 1:");
        int num1=sc.nextInt();
        System.out.print("enter the number 2:");
        int num2=sc.nextInt();
        System.out.print("enter the number 3:");
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
           System.out.println("the number1 is the largest");
        }
        else if(num2>num1 && num2>num3){
             System.out.println("the number2 is the largest");
        }
        else{
            System.out.println("the number3 is the largest");
        }

    }
}
