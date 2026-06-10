/*
Programmer: Melany Garcia
*/
package atmtest; 
import java.util.Scanner;
import java.util.ArrayList;

public class ATMTest {
  
    public static void main(String[] args) {
        
        //declare some variables
        Scanner input = new Scanner(System.in);
        
        //declare an array list of customers
        ArrayList<ATM> customers = new ArrayList<>();
        
        String firstName;
        double balance;
        int pin;
        
        for(int count = 0; count<5; count++){
            System.out.println("CUSTOMER #"+count);
            
            System.out.print("Enter first name of customer: ");
            firstName = input.next();
             
            System.out.print("Enter your customers 4-digit pin number: ");
            pin = input.nextInt();
        
            System.out.print("Enter your customers balance: ");
            balance = input.nextDouble(); 
            System.out.println("END OF CUSTOMER #"+count+"\n");
        
        //create an instance of ATM
        ATM customer1 = new ATM(firstName, pin, balance);
        
        customers.add(customer1);  //added an instance of ATM to the arraylist
        
        }//end of for loop creating arraylist
        
        //output list of customers
        
        for(int count = 0; count<customers.size(); count++){
        
        System.out.printf("%10s%5d%10.2f%n",
                customers.get(count).getName(),
                customers.get(count).getPin(),
                customers.get(count).getBalance());
        }//end of customer output for loop
        
        //start infinite while loop
        while(true){
            System.out.println("Welcome to MoonBank");//welcome screen           
            System.out.print("Please enter your 4-digit pin number here: ");
            int somePin = input.nextInt();
            
            int index = -1;
            
            for(int i = 0; i < customers.size(); i++){
                if(customers.get(i).getPin() == somePin){
                    index = i;
                    break;
                    }//end of if
                }//end of for
            if(index == -1){
                System.out.println("Invalid pin number");
                continue;
                }//end of if
                       
            
            System.out.println("Welcome "+customers.get(index).getName());
            System.out.println("Your balance is "+customers.get(index)
                        .getBalance());
            System.out.println("Pin: "+customers.get(index).getPin());
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Exit");
            System.out.print("Choose an option ");
            int num1 = input.nextInt();
            switch(num1){
                case 1://option 1
                System.out.print("Enter amount of deposit: ");
                double Deposit = input.nextDouble();
                customers.get(index).deposit(Deposit);
                System.out.println("Your new balance is "+
                 customers.get(index).getBalance());
                break;
                case 2://option 2
                System.out.print("Enter withdrawal amount: ");
                double Withdrawal = input.nextDouble();
                customers.get(index).withdrawal(Withdrawal);
                System.out.println("Your new balance is "+
                 customers.get(index).getBalance());
                break;
                case 3://option 3
                System.out.print("Thank you!");
                return;
            }//end of switch
        }//end of while
          
        //USE A FOR LOOP AND DETERMINE THE INDEX OF THE CUSTOMER WHOSE PIN MATCHES
        //THE INPUT PIN
        //INSIDE THIS LOOP HAVE A BOOL VARIABLE THAT TURNS TRUE IF THERE IS A MATCH
        //IF NO MATCH GO TO TOP OF LOOP -CONTINUE
        
        
        //output menu -deposit, withdraw,  or exit
        //read the selected option
        //use a switch or nested for the withdraw, deposit or exit USING THE INDEX
        //TO GET THAT SPECIFIC ELEMENT AND CALL THE APPROPRIATE INSTANCE METHOD
        //end of while loop   
            
        //end of infinite loop 
        
    }//end of main
    
}//end of atmtest