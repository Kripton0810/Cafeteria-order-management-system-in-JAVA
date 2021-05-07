/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class SalaryMaker {
   public double salary(int at,int ct,double sal)
   {
       double salary=0;
       int d = ct-at;
       if(d<=0)
       {
           salary=sal;
       }
       else if(d<=20)
       {
           salary = sal*(1+ 0.0025);
       }else if(d<=60)
       {
           salary = sal*(1+ 0.0035);
       }else if(d<=100)
       {
           salary = sal*(1+ 0.005);
       }
       return salary;
   }
    
}
