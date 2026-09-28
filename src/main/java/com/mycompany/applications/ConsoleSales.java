/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.applications;

/**
 *
 * @author Student
 */
class ConsoleSales extends Consoles {
    public ConsoleSales(String ConsoleType, String store,int salesTotal){
        super(consoleType,store,salesTotal);
    }
    public void showReport(){
        System.out.println("CONSOLE SALES REPORT");
         System.out.println("Console type" + getconsoleType());
         System.out.println("Store name" + getstore());
         System.out.println("Total" +salesTotal());
         
    }

    private String salesTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getstore() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getconsoleType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

