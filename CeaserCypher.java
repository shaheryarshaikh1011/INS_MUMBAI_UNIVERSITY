/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Shaheryar
 */
public class CeaserCypher {
public static final String Alphabet="abcdefghijklmnopqrstuvwxyz";
public static String encrypt(String plaintext,int shiftkey)
{
    plaintext=plaintext.toLowerCase();
    String ciphertext="";
    for(int i=0;i<plaintext.length();i++)
    {
           int charposition=Alphabet.indexOf(plaintext.charAt(i));
           int keyval=(shiftkey+charposition)%26;
           char replaceval=Alphabet.charAt(keyval);
           ciphertext+=replaceval;
           
    }
    return ciphertext;
   
}
public static String decrypt(String ciphertext,int shiftkey)
{
   ciphertext=ciphertext.toLowerCase();
   String plaintext="";
   for(int i=0;i<ciphertext.length();i++)
   {
       int charposition=Alphabet.indexOf(ciphertext.charAt(i));
       int keyval=(26-(shiftkey-charposition))%26;
       char replaceval=Alphabet.charAt(keyval);
       plaintext+=replaceval;
   }
   return plaintext;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter en");
        String msg=new String();
        msg=sc.next();
        System.out.println("Encrypted text is "+encrypt(msg,3));
        System.out.println("Decrypted text is "+decrypt(encrypt(msg,3),3));
        sc.close();
        
    }
    
}
