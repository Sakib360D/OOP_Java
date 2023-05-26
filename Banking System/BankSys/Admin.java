
package BankSys;
import BankSys.*;

import java.util.Scanner;


public class Admin
{
     public void main() {
       System.out.println("\n\n\n        |=============== Admin Panel ==================|");
       System.out.println("        |                                              |");    
       System.out.println("        |         1.Update Customer Information        |");
       System.out.println("        |                                              |");   
       System.out.println("        |         2.Update transaction                 |");
       System.out.println("        |                                              |");   
       System.out.println("        |         3.Create New Account                 |");
       System.out.println("        |                                              |");
       System.out.println("        |==============================================|");
       System.out.print  ("                      Choose Your Option =>");
        
        Scanner input=new Scanner(System.in);
        int select=input.nextInt();

        if(select==1)
        {
            Scanner sc=new Scanner(System.in);
        Update_new_customer obj=new Update_new_customer();

            System.out.println("\n\n        |==== Updating...  CUSTOMER INFORMATION ====|");
            System.out.print("\n              Change Customer Recent Address: ");
            String cusad=sc.nextLine();
            System.out.print("\n              Change Customer Number        : ");
            int cusid=sc.nextInt();
            System.out.print("\n              Change Customer Main Brench   : ");
            Scanner rr=new Scanner(System.in);
            String k=rr.nextLine();   
        
        obj.update_new_customer_setter(cusad,cusid,k);
      
     
System.out.println("\n\n        |==== SUCCESSFULLY CHANGED THE CUSTOMER INFORMATION ====|");
    System.out.println("        |                                                       |");    
    System.out.println("        *           Change Customer Recent Address: "+obj.update_new_customer_getter2()+"           *");
    System.out.println("        |                                                       |");   
    System.out.println("        *           Change Customer Number: "+obj.update_new_customer_getter()+"           *");
    System.out.println("        |                                                       |");   
    System.out.println("        *           Change Customer Main Brench: "+obj.update_new_customer_getter1()+"           *");
    System.out.println("        |                                                       |");
    System.out.println("        |=======================================================|\n");      

        

 System.out.println("\n\n                   ***********************************");
     System.out.println("                   * ******************************* *");
     System.out.println("                   * * WELCOME TO TAKE OUR SERVICE * *");
     System.out.println("                   * ******************************* *");
     System.out.println("                   ***********************************\n\n");       
      }
        

        //2nd part
        else if(select==2)
        {

          Scanner scc=new Scanner(System.in);
        Update_tansection obj1=new Update_tansection();
            System.out.println("\n\n        |============= Transaction =============|");
            System.out.print("\n                       Customer Name : ");
            String cusad=scc.nextLine();
            System.out.print("\n                       Customer Id: ");
            int cusid=scc.nextInt();
            System.out.print("\n                       Transaction Amount: ");
            Scanner rrr=new Scanner(System.in);
        String k=rrr.nextLine();   
        obj1.update_new_customer_setter(cusad,cusid,k);
      
     
     System.out.println("\n"+"\n"+"                 ***SUCCESSFULLY TRANSACTION DONE***"+"\n"+"\n");

System.out.println("\n\n                   ***********************************");
     System.out.println("                   * ******************************* *");
     System.out.println("                   * * WELCOME TO TAKE OUR SERVICE * *");
     System.out.println("                   * ******************************* *");
     System.out.println("                   ***********************************\n\n");


        }
        

        //3rd part
        else if(select==3)
        {
            Scanner sc=new Scanner(System.in);
      Update_new_customer obj=new Update_new_customer();
        System.out.println("\n\n        |==== Creating...  Customer New Account ====|");
        System.out.print("\n                     Customer Name: ");
            String cusad=sc.nextLine();
            System.out.print("\n                     New Id: ");
            int cusid=sc.nextInt();
            System.out.print("\n                    Customer Address: ");
            Scanner rr=new Scanner(System.in);
        String k=rr.nextLine();   
       // obj.update_new_customer_setter(cusad,cusid,k);
      
  System.out.println("\n        |====    SUCCESSFULLY CREATED CUSTOMER NEW ACCOUNT  ====|");
    System.out.println("        |                                                       |");    
    System.out.println("        *           Customer Name: "+obj.update_new_customer_getter2()+"           *");
    System.out.println("        |                                                       |");   
    System.out.println("        *           New Id: "+obj.update_new_customer_getter()+"           *");
    System.out.println("        |                                                       |");   
    System.out.println("        *           Customer Address: "+obj.update_new_customer_getter1()+"           *");
    System.out.println("        |                                                       |");
    System.out.println("        |=======================================================|\n");        
        

     System.out.println("\n\n                   ***********************************");
     System.out.println("                   * ******************************* *");
     System.out.println("                   * * WELCOME TO TAKE OUR SERVICE * *");
     System.out.println("                   * ******************************* *");
     System.out.println("                   ***********************************\n\n");
        
        }
        else {
             System.out.print  ("                      [ You Entered Wrong key ]            ");
             
        }
    }
    
}
