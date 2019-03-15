/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class Transactions {
    public String transaction[]= new String[5];
public  static int index=0;
int count;
public static ArrayList<Double> balanceList=new ArrayList<>();
public static ArrayList<Double> amountlist=new ArrayList<>();
  int u=(balanceList.size()-1);
 




public String previous(){ 
   if(u == 0){
            return"no history";
        }
        else {u=u-1;
        
      String f = String.valueOf(amountlist.get(u));
        return f;}
    }

public String next(){
        if(u == balanceList.size()-1){
            return"no history";
        }
        else {u=u-1;
      String f = String.valueOf(amountlist.get(u));
        return f;}
    }

}


    

