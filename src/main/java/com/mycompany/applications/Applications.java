/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.applications;

/**
 *
 * @author Student
 */
public class Applications {
      public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
         System.out.println("Select a console");
         System.out.println("1. PS5");
         System.out.println("2. XBOX");
         System.out.println("3. SWITCH");
         input.nextLine();
         
         String type;
        int choice = 0;
         if(choice ==1){
             type = "PS2";
         }
         else if (choice==2){
             type = "XBOX";
         }
         else if(choice==3){
             type = "XBOX";
         }
          System.out.println("Enter the store name: ");
          String store = input.nextLine();
           System.out.println("Enter the total amount of sales: ");
          String salesTotal = input.nextLine();
          ConsoleSales report = new ConsoleSales(consoleType, store, salesTotal);
          report.printReport();
    }
}

    }
}
