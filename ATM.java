/*
 ATM class with instance members and methods
*/
package atmtest;


public class ATM {
    
    //declare the instance variables
    String firstName;
    //others such as pin and balance
    int pin;
    double balance;
    
    //construtor with parameters
    public ATM(String someFirstName, int somePin, double someBalance){
        this.firstName = someFirstName;
        this.pin = somePin;
        this.balance = someBalance;
    }//end of constructor
    
    //get and set methods
    
    //get method for the name
    public String getName(){
        return this.firstName;
    }//end of getName
    
    public double getBalance(){
        return this.balance;
    }
    
    public int getPin(){
        return this.pin;
    }
    
    //create a public method to deposit
    
    public void deposit(double depAmt){
        if(depAmt>=0){
            this.balance+=depAmt;
        }//end of if
    }
    
    //create a public method to withdraw
    
    public void withdrawal(double WithAmt){
        if(WithAmt>=0&&WithAmt<=balance){
            this.balance-=WithAmt;
        }//end of if
    }
    
    
}//end of ATM
