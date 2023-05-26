import BankSys.*;

import java.util.Scanner;


public class Bank {


    public static void main(String[] args)
    {
       Bank objj=new Bank();
       Login log=new Login();
       Admin ab=new Admin();
       User fg=new User();
       log.main();
      
 	int a=100;
 	
 	while(a!=0){
    System.out.println("\n\n\n\n        |======= Welcome To Our Bank Service ==========|");
  System.out.println("        |                                              |");    
 	System.out.println("        |         *Press (1) for Customer Login        |");
  System.out.println("        |                                              |");   
 	System.out.println("        |         *Press (2) for   Admin  Login        |");
  System.out.println("        |                                              |");
  System.out.println("        |==============================================|");
 	System.out.print  ("                      [ Press (0) for Exit ]            ");
 	
 	Scanner scc=new Scanner(System.in);
  System.out.print  ("\n                       Press  => ");
 	a=scc.nextInt();
        if( a == 1)
        {
                fg.main();
        }
        else if( a == 2)
        {
            ab.main();
        }

      }
    }
    
}

   /*

    System.out.println("\n        |==== SUCCESSFULLY CHANGED THE CUSTOMER INFORMATION ====|");
    System.out.println("        |                                                       |");    
    System.out.println("        *           Customer Name: "+obj.update_new_customer_getter2()+"           *");
    System.out.println("        |                                                       |");   
    System.out.println("        *           New Id: "+obj.update_new_customer_getter()+"           *");
    System.out.println("        |                                                       |");   
    System.out.println("        *           Customer Address: "+obj.update_new_customer_getter1()+"           *");
    System.out.println("        |                                                       |");
    System.out.println("        |=======================================================|\n");
    
*/
