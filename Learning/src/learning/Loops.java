/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

/**
 *
 * @author mpirixan
 */
public class Loops {
    
        public static void main(String[] args) {
    
            String sb = "a" ;
            String sc = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" ;
    
            int b = sb.length();
            int c = sc.length();
            
            System.out.println("valor b= "+ b);
            System.out.println("valor c= "+c);
            
            while(b<=c){
                System.out.println(b);
                b++;
            }
        }
        
    
}
