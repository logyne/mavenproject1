/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import static com.mycompany.mavenproject1.MyATM.tr;
import static com.mycompany.mavenproject1.Transactions.amountlist;
import static com.mycompany.mavenproject1.Transactions.balanceList;
import javax.swing.JOptionPane;

/**
 *
 * @author logynmedhat
 */
public class Balance {
   public double balance ;
    public Balance (double initialBalance){
    if (initialBalance>0.0)
     balance=initialBalance;
    }
    public void getCurrentBalance(){
         balanceList.add(balance);
       
          
    }
    public void withdraw(double amount){
        
    
        if (amount > balance){
   JOptionPane.showMessageDialog(null, "Error ");
       }
     String num=String.valueOf(amount);
     balance=balance-amount;
    System.out.println(balance);
    
    if (balance<0)
    {System.out.println("not enough balance");
    
    balance=balance+amount;
    }balanceList.add(balance);
      amountlist.add(amount);
    
    }
    public void deposit (double money){
       
        balance=balance+money;
        System.out.println(balance);
     balanceList.add(balance);
    amountlist.add(money);
    } 
    public void previous(){
       tr.previous();
   }
    public void next(){
      tr.next();
      
    }

     
                  
}
