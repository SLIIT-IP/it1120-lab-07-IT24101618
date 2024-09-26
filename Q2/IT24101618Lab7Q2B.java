public class IT24101618Lab7Q2B{
    public static void main(String[] args){
        for (int i = 1; i <= 5; i++) {
            // Print the number
            System.out.print(i + " ");
            
            // Print stars equal to the current number
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Move to the next line after each row
            System.out.println();
            
        }
    }
}