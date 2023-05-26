package BankSys;
import BankSys.*;

import java.util.Scanner;


public class BankAccount 
{
    private int balance;
    private int previousTransaction;
    private final String customerName;
    private final String customerId;

    public BankAccount(String cname, String cid){
        this.customerName = cname;
        this.customerId = cid;
    }

    public void setBalance(int balance){
        this.balance=balance;
    }

    public int getBalance(){
        return balance;
    }

    public void setPreviousTransaction(int previousTransaction){
        this.previousTransaction=previousTransaction;
    }

    public int getPreviousTransaction(){
        return previousTransaction;
    }

    public void deposit(int amount){
        if (amount != 0) {
            this.balance += amount;
            this.previousTransaction = amount;
        }
    }

    public void withDraw(int amount){
        if(amount != 0){
            this.balance -= amount;
            this.previousTransaction = -amount;
        }
    }

    public void getPreviousTransaction1(){
        if(this.previousTransaction > 0){
            System.out.println("Deposited: " + this.previousTransaction);
        }else if(this.previousTransaction < 0){
            System.out.println("\n                      |=======WithDrawed: " + this.previousTransaction);
        }else{
            System.out.println("No Transaction occured");
        }
    }




    public void showMenu(){
        int option;
        char cont;
        
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("\n        You are Welcome to our Banking System  ["+this.customerName+"]  *");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("        *           Your Id is: [" + this.customerId+"]  *");
        System.out.println("        |                                           |");
        System.out.println("        *           Choose From Below Menu          |");
        System.out.println("        |                                           |");
        System.out.println("        *           1.Deposit                       |");
        System.out.println("        |                                           |");
        System.out.println("        *           2.Check Balance                 |");
        System.out.println("        |                                           |");
        System.out.println("        *           3.WithDraw                      |");
        System.out.println("        |                                           |");
        System.out.println("        *           4.Previous transaction          |");
        System.out.println("        |                                           |");
        System.out.println("        *           5. EXIT                         |");
        System.out.println("        |                                           |");
        System.out.println("        |===========================================|\n"); 
       // do{
            System.out.print("                   Enter an option => ");
            option = scanner.nextInt();
            System.out.println("\n");

            switch (option){
                case 1:
                     System.out.print("\n\n                 |=== Enter  Amount to deposit: ");
                     int amount = scanner.nextInt();

                     this.deposit(amount);

                     System.out.println("\n\n                    |===***Total Amount Diposited = [" + this.balance+"]  ====|");
                                          
                     System.out.println("\n");
                    
                     System.out.print("\n                     |=== ***  ["+this.customerName+"]  Do you want to continue? [ Y/N ] *==>");

                                    cont = scanner.next().charAt(0);

                                     if (cont=='Y' || cont=='y' ){
                                   showMenu();
                                     } 

                                   else if(cont=='n' || cont=='N'){

                                      break;
                                    }
                                      else{
      
                                   System.out.println("\n                  |=== Wrong Key ! Please enter again!! ====|");

                                    break;
                                      }
                case 2:
                    System.out.println("\n\n                  |===  ***Your Total Balance = [" + this.balance+"]  ====|");
                    System.out.print("\n                      |===***  ["+this.customerName+"]  Do you want to continue? [ Y/N ] ==>");

                                cont = scanner.next().charAt(0);
                                        if (cont=='Y' || cont=='y' ){
                                           showMenu();
                                                 } 
                 
                                   else if(cont=='n' || cont=='N'){

                                          break;
                                   }
                                       else{
                    
                                     System.out.println("\n                  |=== Wrong Key ! Please enter again!!====|");

                                      break;
                                         }
                case 3:
                    System.out.print("\n\n                   |===Enter an amount to withdraw: ");
                    int amount2 = scanner.nextInt();
                    this.withDraw(amount2);
                    System.out.println("\n\n                    |===***Now Your Total Balance = [" + this.balance+"]  ====|");
                    System.out.println("\n");
                    System.out.print("\n                     |=== ***  ["+this.customerName+"]  Do you want to continue? [ Y/N ] ==>");

                              cont = scanner.next().charAt(0);

                            if (cont=='Y' || cont=='y' ){
                                 showMenu();
                                                } 

                            else if(cont=='n' || cont=='N'){

                                     break;
                                 }
                              else{

                                   System.out.println("\n                   |====Wrong Key ! Please enter again!!====|");
 
                             break;
                                                       }
                case 4:
                    this.getPreviousTransaction1();
                    System.out.print("\n                      |===*  ["+this.customerName+"]  Do you want to continue? [ Y/N ] =  =>");

                     cont = scanner.next().charAt(0);

                      if (cont=='Y' || cont=='y' ){
                       showMenu();
                                   } 

                        else if(cont=='n' || cont=='N'){

                                    break;
                                           }
                                else{

                                        System.out.println("\n                   |====Wrong Key ! Please enter again!!====|");

                                                  break;
                                                                                 }
                case 5:
                    System.out.println("\n                |===*Thank you for using our services!====|");
                     break;
                default:
                    System.out.println("\n               |===* Invalid Option! Please enter again!====|");
                    break;
            }
        //} while (Character.isAlphabetic(option));

        //System.out.println("\n                   Invalid Option! Please enter again!!");
    }

    
    
}


