package BankSys;
import BankSys.*;

import java.io.FileInputStream;    
import java.io.IOException;    
import java.util.Scanner;    
   
public class reader {        
    public  void main() {
        try{
        Scanner s1,s2;
        s1=new Scanner(new FileInputStream("E:/AIUB/Semester 4/OOP1 Java/Final/Project/Banking System/BankSys/login.txt"));
        s2=new Scanner(System.in);
        boolean flag=false;
        String name,pword,n,p;
        System.out.println("\n\n\n\n        |=========== Login System ==========|");
        System.out.print("\n                   Enter name:");
        n=s2.next();
        System.out.print("\n                   Enter password:");
        p=s2.next();
        while(s1.hasNext()) {
            name=s1.next();
            pword=s1.next();
            if(n.equals(name) && p.equals(pword)) {
                System.out.println("\n\n         **Succesfully You are logged in to Our System.");
                flag=true;
                break;
            }  else{
                System.out.println("\n\n\n\n        |!!!!!! Incorrect Information. !!!!!!|");
                
                System.out.println("\n\n\n       *Please Try Again with valid Information*\n");
                System.out.println("\n\n\n\n*----------|!!!!!!!! *Alert* !!!!!!!!!|----------------------------------------------------------");
                main();
               
        } 


        }

    }


        catch(IOException e){
            System.out.println("Incorrect password.");
        }
        

    }
}