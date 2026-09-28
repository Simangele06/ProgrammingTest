/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicgaming;

/**
 *
 * @author Student
 */
public class ElectronicGaming {

    public static void main(String[] args) {
 
        
//Declaration
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] gaming = {"PS5", "XBOX", "SWITCH"};
        int[][] sales = {{1000,2000,1500},
                        {2000,3000,1100,},
                        {3000,4000,1200}};
        
        int[] totalCities = new int[3];
        
        for(int row = 0; row <3; row++){
            int total= 0;
            for (int column = 0; column <3; column++){
                total = total + sales[row][column];
            }
            totalCities[row] = total;
        }
        int highest = totalCities[0];
        int highestIndex = 0;
        for(int i = 1; i <3; i++){
            if(totalCities[i] > highest ){
                highest = totalCities[i];
                highestIndex = i; 
            }
        }
        System.out.println("GAME CONSOLE REPORT");
         System.out.println("\t\t\t");
         for(int column = 0; column  <3; column ++){
              //System.out.print(consoles[column] + "\t");
         }
        
        
         for(int row = 0; row <3; row++){
              System.out.println(cities[row].toUpperCase() + "\t\t");
                for(int i = 0; i <3; i++){
                  int column = 0;
             System.out.println(sales[row][column] + "\t");
                     }
                 System.out.println("");
                }
         System.out.println(" CONSOLE SALES TOTALS FOR EACH CITIES");
        for(int i = 0; i <3; i++){
             System.out.println(cities[i].toUpperCase() + "\t\t" + totalCities[i]);
        }
          System.out.println("CITIES WITH THE MOST SALES:"+ cities[highestIndex].toUpperCase());
        
        
        
        
        
    }
}

    

