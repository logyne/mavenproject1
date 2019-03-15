/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import static com.mycompany.mavenproject1.NewJFrame.acc;
import static java.lang.Compiler.disable;
import java.util.Scanner;



public class MyATM { 
   
    public static MyATM Account= new MyATM();
    public static Transactions tr =new Transactions();
    public static Balance y =new Balance(0.0);
    
    public static void main(String[] args) {
        
        NewJFrame gui= new NewJFrame();
        NewJFrame.main(new String[0]);
     
        
    }
    
}

    

