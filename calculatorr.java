import java.util.Scanner;
public class calculatorr{
    public int addition(int a,int b){
        return a+b;  
    }
    public int subraction(int a,int b){
        return a-b;  
    }
    public int multiplication(int a,int b){
        return a*b;
    }
    public int division(int a,int b){
        if(b==0){
            System.out.println("divide by zero error");
            return 0;
        }
        return a/b;
    }

    public static void main(String[] args) {
        calculatorr c=new calculatorr();
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the operation:\n1.add\n2.sub\n3.mul\n4.div\n): ");
        System.out.print("enter the operation:");
        String op=sc.next();
        System.out.print("enter num1:");
        int n1=sc.nextInt();
        System.out.print("enter num2:");
        int n2=sc.nextInt();
        switch (op) {
            case "add":
                System.out.print("addition:");
                System.out.println(c.addition(n1,n2));
                break;
            case "sub":
                System.out.println(c.subraction(n1,n2));
                break;
            case "mul":
                System.out.println(c.multiplication(n1,n2));
                break;
            case "div":
                System.out.println(c.division(n1, n2));
                break;
            default:
            System.out.println("enter valid opr");
                break;
        }
    }
}
