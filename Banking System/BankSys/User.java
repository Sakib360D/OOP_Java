
package BankSys;
import BankSys.*;

import java.util.Scanner;


public class User {
        public void main() {
        Scanner scc = new Scanner(System.in);
        System.out.println("\n\n          ====== Customer Login System ======\n           ");    
        System.out.println("                 ----------------------                 ");    
 	    System.out.println("                 |  Enter Your Name   |                 ");
 	    System.out.println("                 ----------------------                 ");
 	    System.out.print("                            ");


 	    String name = scc.nextLine();

 	    System.out.println("                                                        "); 
        System.out.println("                 ----------------------                 ");   
 	    System.out.println("                 |   Enter Your Id    |                 ");
 	    System.out.println("                 ----------------------                 ");
        System.out.print("                            ");
 	    String id  = scc.nextLine();
               
        BankAccount bankAccount = new BankAccount(name,id);
        bankAccount.showMenu();
    
}
}

    