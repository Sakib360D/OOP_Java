package BankSys;
import BankSys.*;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.io.FileInputStream;    
import java.io.IOException;
import java.io.*;

public class Login{
	public void main() {

       Scanner scc = new Scanner(System.in);
       reader check =new reader();
       int choice;

       System.out.println("\n\n\n\n        |======= Welcome To Our Banking System ======|");
            System.out.print("\n                            1.Sign Up");
            
            System.out.print("\n                            2.Login ");
            System.out.print("\n\n         (Enter Your Choice) => ");
            choice = scc.nextInt();
            
//Login System
            if(choice==1){

        //Sign Up
        try {
            Formatter inData = new Formatter("E:/AIUB/Semester 4/OOP1 Java/Final/Project/Banking System/BankSys/login.txt");
            String id, pass;
            System.out.println("\n\n\n\n                    |=========== Sign Up ==========|");
            System.out.print("\n                             Enter User Id: ");
            id = scc.next();
            System.out.print("\n                             Enter Password: ");
            pass = scc.next();

            //inData.format("%s %s\n", id, pass);
            inData.format("%s \n",  id);
            inData.format("%s \n", pass);
            inData.close();
            System.out.println("\n       ***Your Account Created Succesfully!!!");
            System.out.println("\n                 ***Now Try to Login!!!");
        } catch (FileNotFoundException e) {
            System.out.println("Your Information Was not Found!!!");
        }
        check.main();
    }

    else if(choice==2){

        check.main();

    }
    else{
    	System.out.println("\n\n\n                                   You Press Wrong key!!!");
        System.out.println("\n                    |=========== Please Try Again ==========|");
        System.out.println("                         Your Information Was not Found!!!\n\n");
    	main();
    }

		
	}
	
}