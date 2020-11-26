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
public class mono {
public static char p[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
public static char ch[]={'Z','Y','X','W','V','U','T','S','R','Q','P','O','N','M','L','K','J','I','H','G','F','E','D','C','B','A'};
public static String doEnc(String s)
{
char c[]=new char[s.length()];
    for(int i=0;i<s.length();i++)
    {
        for(int j=0;j<26;j++)
        {
            if(p[j]==s.charAt(i))
            {
                c[i]=ch[j];
                break;
            }
        }
    }
    return(new String(c));
}
public static String doDec(String s)
{
    char p1[]=new char[s.length()];
    for(int i=0;i<s.length();i++)
    {
        for(int j=0;j<26;j++)
        {
            if(ch[j]==s.charAt(i))
            {
                p1[i]=p[j];
                break;
            }
        }
    }
    return(new String(p1));
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter en");
        String en=doEnc(sc.next().toLowerCase());
        System.out.println("Encrypted msg is: "+en);
        System.out.println("decrypted msg is: "+doDec(en));
        sc.close();
    }
    
}
