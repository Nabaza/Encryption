/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomad;

import java.util.Scanner;

/**
 *
 * @author nabaz
 */
public class Checker {
    
    
     public static void main(String[] args) throws Exception {
             Scanner sc = new Scanner (System.in);

         System.out.println("Enter password");
      
        String password = sc.nextLine();
         System.out.println("Dit password er "+password);
         
         String stringByte = sc.nextLine();
         AESencrp.setKeyValue(stringByte.getBytes());
         
        
         
        String passwordEnc = AESencrp.encrypt(password);
         System.out.println("Indtast decrypt key");
         String decString = sc.nextLine();
         AESencrp.setKeyValue(decString.getBytes());
        String passwordDec = AESencrp.decrypt(passwordEnc);

        System.out.println("Plain Text : " + password);
        System.out.println("Encrypted Text : " + passwordEnc);
        System.out.println("Decrypted Text : " + passwordDec);
    }
}



