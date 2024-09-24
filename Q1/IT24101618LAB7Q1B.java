import java.util.Scanner;

public class IT24101618Lab7Q1B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        for (int student = 1; student <= 3; student++) {
            System.out.println("Enter marks for 4 subjects for student " + student + " (separated by spaces):");
            String[] marks = sc.nextLine().split(" ");

            
            int total = 0;
            for (String mark : marks) {
                total += Integer.parseInt(mark);
            }

           
            int average = total / marks.length;

            
            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            
            System.out.println("Student " + student + ": Average = " + average + ", Grade = " + grade);
        }
        
        sc.close();
    }
}