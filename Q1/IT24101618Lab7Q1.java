import java.util.Scanner;

public class IT24101618Lab7Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		System.out.print("Enter subject mark 01: ");
		double mark01 = scanner.nextDouble();
		
		System.out.print("Enter subject mark 02: ");
		double mark02 = scanner.nextDouble();
		
		System.out.print("Enter subject mark 03: ");
		double mark03 = scanner.nextDouble();
		
		System.out.print("Enter subject mark 04: ");
		double mark04 = scanner.nextDouble();
		
		double average = ((mark01+mark02+mark03+mark04)/4);
		
		if(average>= 75)
		{
		    System.out.println("The grade is: distintion "  );
		}
		else if(average>= 50)
		{
		     System.out.println("The grade is: credit "  );
		}
		else 
		{
		    System.out.println("The grade is: fail "  );
		}
		
		System.out.println("The average is " + average );
		
		
		
		
		
        scanner.close();
    }
}