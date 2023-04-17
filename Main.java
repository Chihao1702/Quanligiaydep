package quanlygiaydep;

import java.util.Scanner;
import quanlygiaydep.List;

public class Main{
    public static void main(String[] args) {
               List l = new List();
        
 
        Scanner sc = new Scanner (System.in);   
        
        
        int chon;
        do
        {
            System.out.println("Quan li kho giay dep");        
            System.out.println("moi chon 1 de thuc hien chuc nang:");
            chon= sc.nextInt();
                      
                if(chon !=0)
                    
                { switch (chon)
                {
                   case 1: l.menu() ; break ;                
                }
               
                }
        }
        while(chon !=0);
    }}
