import java.util.Scanner;
public class IT24101618Lab7Q3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        for(int coustermercount = 1;coustermercount<=5;coustermercount++){
            System.out.println("customer "+coustermercount);
            
            System.out.println("Enter total bill amuont :");
            int totalAmount = scanner.nextInt();
            System.out.println("enter the payment mode(c for cash o for other) :");
            char mode = scanner.next().charAt(0);
            if(mode=='c'){
                int disprice = (totalAmount/100)*95;
                System.out.println("discounted price is :"+ disprice);
                }else if (mode=='o'){
                    System.out.println("no discount available");
                    System.out.println("total amount is :"+totalAmount);
                    }else{
                        System.out.println("worng payment methed");
                    }
                }
            }
        }
    

