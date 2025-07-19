import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter marks for Subject A:");
        int subjectA = input.nextInt();

        System.out.println("Enter marks for Subject B:");
        int subjectB = input.nextInt();

        System.out.println("Enter marks for Subject C:");
        int subjectC = input.nextInt();

        
        int total = subjectA + subjectB + subjectC;
        double average = total / 3.0;

        
        String result;
        if (average >= 90 && subjectA >= 85 && subjectB >= 85 && subjectC >= 85) {
            result = "Excellent";
        } else if (average >= 75 || (subjectA >= 70 && subjectB >= 70)) {
            result = "Good";
        } else if (!(average < 50)) {
            result = "Pass";
        } else {
            result = "Fail";
        }


        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Performance: " + result);

        System.out.println("\nChoose grade category to know more:");
        System.out.println("1: Excellent\n2: Good\n3: Pass\n4: Fail");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Excellent: Top-notch! All subjects scored high.");
                break;
            case 2:
                System.out.println("Good: Solid effort, with strong individual performance.");
                break;
            case 3:
                System.out.println("Pass: You've made it through. Improvement is key.");
                break;
            case 4:
                System.out.println("Fail: Don't give up—this is just one checkpoint.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        input.close();
    }
}